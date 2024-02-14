package com.learn.springbootdemo.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users/.......
public class UserController {

    @GetMapping
    public String getUser() {
        return "Get User was Called";
    }

    @PostMapping
    public String createUser() {
        return "CREATE USER WAS CALELD";
    }

    @PutMapping
    public String updateUser() {
        return "Update User was Called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Delete API Was Called";
    }
}
