package com.example.userbackup.service;

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
    public User getByFirstName() {
        return null;
    }

    public User addUser(User u) {
/*
        User user = new User();
        user.setFirstName(u.getFirstName());
        user.setLastName(u.getLastName());
        user.setEmail(u.getEmail());
*/
        return userRepository.save(u);

    }

    public Iterable<User> findAll() {
        return userRepository.findAll() ;
    }

    public User updateUser(User user) {
//        User user = new User();
//        user.setId(id);
//        user.setFirstName(firstName);
//        user.setLastName(lastName);
//        user.setPhoneNumber(phoneNumber);
//        user.setEmail(email);
        return userRepository.save(user);
    }


    public void deleteById(String id) {
//        try {
            userRepository.deleteById(id);
//        } catch (Exception e) {
//            throw e;
//        }
    }

    public void deleteAllUsers() {
        try {
            userRepository.deleteAll();
        } catch (Exception e) {
            throw e;
        }
    }
}
