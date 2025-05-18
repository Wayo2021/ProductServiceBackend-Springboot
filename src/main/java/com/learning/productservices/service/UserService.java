package com.learning.productservices.service;

import com.learning.productservices.model.dto.UserDto;
import com.learning.productservices.model.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> saveUser(UserDto userDto);

    List<User> listAll();

    Optional<User> getById(Long id);

    Optional<User> search(UserDto userDto);

    Optional<User> searchEmail(UserDto userDto);

    List<User> fetchUser();

    Optional<User> updateUserById(UserDto bo, Long userId);

    void deleteUserById(Long userId);

}
