package com.example.userbackup.controller;

import com.example.userbackup.controller.response.UserResponse;
import com.example.userbackup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.userbackup.entity.User;

@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody UserResponse addNewUser (@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping
    public @ResponseBody Iterable<User> getAllUsers() { return userService.findAll(); }

    @PutMapping (consumes = "application/json", produces = "application/json")
    public @ResponseBody UserResponse updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping(path= "/{id}")
    public void delete_by_id(@PathVariable String id) {
        userService.deleteById(id);
    }

}