package com.example.book_java_backend.controller;

import com.example.book_java_backend.modal.User;
import com.example.book_java_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add/user")
    public  void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/get/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
