package com.second.controller;

import com.second.model.User;
import com.second.model.UserBody;
import com.second.repository.UserRepository;
import com.second.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping
public class UserController {
//    @Autowired
    private final UserRepository userRepository;

    UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }


    @GetMapping("/users")
    public ResponseEntity getAllUsers() {
//        return ResponseEntity.ok(this.userRepository.findAll());
        return new ResponseEntity<>(userService.getUser(), HttpStatus.OK);
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
        userRepository.save(new User(UUID.randomUUID(), user.username));
//        userRepository.save(new User(user.username));
        return "The user is added successfully.";
    }
}

