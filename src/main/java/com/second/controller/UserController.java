package com.second.controller;

import com.second.model.User;
import com.second.model.UserBody;
import com.second.repository.UserImpl;
import com.second.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Properties;
import java.util.UUID;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/users")
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(this.userRepository.findAll());
    }

    @GetMapping("/user")
    public ResponseEntity getUser(@RequestParam("id") UUID id) {
        System.out.println("The user id is: " + id);
        return ResponseEntity.ok(this.userRepository.findUserById(id));
    }

    @GetMapping("/username")
    public ResponseEntity getUser(@RequestParam("name") String name) {
        System.out.println("The user name is: " + name);
        return ResponseEntity.ok(this.userRepository.findByUsername(name));
    }

    @PostMapping("/add-user")
    public String adduser(@RequestBody UserBody user) {
        System.out.println("The username is: " + user.username);
//        User newUser = new User(UUID.randomUUID(), user.username);
//        System.out.println("The new username is: " + newUser.getUsername());
//        this.userRepository.save(newUser);
        this.userRepository.save(new User(UUID.randomUUID(), user.username));
//        this.userRepository.save(new User(user.username));


//        userRepository.save(newUser);
        return "The user is added successfully.";
    }
}

