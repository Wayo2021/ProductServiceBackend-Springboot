package com.learning.productservices.service.impl;

import com.learning.productservices.exception.errorMessage.ErrorMessages;
import com.learning.productservices.exception.NoSuchExistsException;
import com.learning.productservices.model.dto.UserDto;
import com.learning.productservices.model.entities.Role;
import com.learning.productservices.model.entities.User;
import com.learning.productservices.model.enums.ERole;
import com.learning.productservices.repository.RoleRepository;
import com.learning.productservices.repository.UserRepository;
import com.learning.productservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Optional<User> findByUsername(String username) {

        Optional<User> user = userRepository.findByUsername(username);

        if (user.isPresent()) {
            return user;
        } else {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_NOT_EXIST , username));
        }
    }

    @Override
    public Optional<User> saveUser(UserDto userDto){
        try {
            User user = convertUserJsonBoToObject(userDto);
            User userSaved = userRepository.save(user);
            return Optional.of(userSaved);
        }catch (Exception ex){
            throw  new UsernameNotFoundException(ex.getMessage());
        }
    }

    @Override
    public List<User> listAll() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public List<User> fetchUser(){
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    @Override
    public Optional<User> search(UserDto userDto){
        Optional<User> username = userRepository.findByUsername(userDto.getUsername());
        Optional<User> email = userRepository.findByEmail(userDto.getEmail());

        if(username.isPresent()){
            return username;
        }
        if(email.isPresent()){
            return email;
        }
        throw  new UsernameNotFoundException("User not found");
    }

    @Override
    public Optional<User> searchEmail(UserDto userDto){
        Optional<User> email = userRepository.findByEmail(userDto.getEmail());
        if(email.isPresent()){
            return email;
        }else {
            throw  new UsernameNotFoundException("User not found Email.");
        }
    }

    //convert User Json to Object
    //Data transfer Object = DTO
    private  User convertUserJsonBoToObject(UserDto userDto){
        User userObject = new User();
        Role userRole = roleRepository.findByName(ERole.ROLE_ADMIN)
                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
        Set<Role> roles = new HashSet<>();
        roles.add(userRole);
        userObject.setRoles(roles);
        userObject.setId(userDto.getId());
        userObject.setUsername(userDto.getUsername());
        userObject.setPassword(userDto.getPassword());
        userObject.setEmail(userDto.getEmail());

        return userObject;

    }

    @Override
    public Optional<User> updateUserById(UserDto userDto, Long userId) {

        User user = userRepository.findById(userId).get();

        if(Objects.nonNull(userDto.getUsername()) && !"".equalsIgnoreCase(userDto.getUsername())){
            user.setUsername((userDto.getUsername()));
        }
        if(Objects.nonNull(userDto.getPassword()) && !"".equalsIgnoreCase(userDto.getPassword())){
            user.setPassword((userDto.getPassword()));
        }
        if(Objects.nonNull(userDto.getEmail()) && !"".equalsIgnoreCase(userDto.getEmail())){
            user.setEmail((userDto.getEmail()));
        }

        return Optional.of(userRepository.save(user));
    }

    @Override
    public void deleteUserById(Long userId){
        userRepository.deleteById(userId);
    }
}
