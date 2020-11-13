package com.example.userbackup.controller;

import com.example.userbackup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.userbackup.entity.User;

@RestController
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name,
                                            @RequestParam String lastName,
                                            @RequestParam String email) {


        userService.addUser(name, lastName, email);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() { return userService.findAll(); }

    @PutMapping (path="/{id}")
    public @ResponseBody String updateUser(@RequestParam String firstName,
                                           @RequestParam String lastName,
                                           @RequestParam String phoneNumber,
                                           @RequestParam String email,
                                           @RequestParam String id) {

        userService.updateUser(firstName, lastName, phoneNumber, email, id);
        return "Uploaded";
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(String id) {
        userService.deleteById(id);
    }

    @DeleteMapping("/deleteAllUsers")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }
}