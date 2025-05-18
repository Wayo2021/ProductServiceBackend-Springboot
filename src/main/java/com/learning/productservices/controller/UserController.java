package com.learning.productservices.controller;

import com.learning.productservices.model.dto.UserDto;
import com.learning.productservices.model.entities.User;
import com.learning.productservices.repository.UserRepository;
import com.learning.productservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public ResponseEntity<?> saveUser(@RequestBody UserDto userDto) {
        Optional<User> userSave = userService.saveUser(userDto);
        if (userSave.isPresent()) {
            return ResponseEntity.ok(userSave);
        } else {
            throw new UsernameNotFoundException("User Not Found with create: ");
        }
    }
}
