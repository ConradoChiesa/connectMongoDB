package com.example.userbackup.service;

import com.example.userbackup.controller.response.UserResponse;
import com.example.userbackup.entity.User;
import com.example.userbackup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getById(String id){
        return userRepository.findById(id);
    }

    public UserResponse getByFirstName() {
        return null;
    }

    public UserResponse addUser(User user) {
        User userResponse = userRepository.save(user);
        return new UserResponse(userResponse);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll() ;
    }

    public UserResponse updateUser(User user) {
        User UserResponse = userRepository.save(user);
        return new UserResponse(UserResponse);
    }


    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

}
