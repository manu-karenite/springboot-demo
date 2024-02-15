package com.learn.springbootdemo.ui.controller;

import com.learn.springbootdemo.ui.entity.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users/.......
public class UserController {

    @GetMapping
    public String getUsers(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "limit", required = false, defaultValue = "25") int limit) {
        return String.format("getUser was called with page : %d and limit : %d", page, limit);
    }

    @GetMapping(
            path = "/{userId}",
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserEntity> getUser(@PathVariable String userId) {

        UserEntity userEntityObject = new UserEntity();
        userEntityObject.setFirstName("Manavesh");
        userEntityObject.setLastName("Narendra");
        userEntityObject.setAge(24);

        return new ResponseEntity<UserEntity>(userEntityObject, HttpStatus.OK);
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
