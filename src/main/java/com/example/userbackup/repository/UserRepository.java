package com.example.userbackup.repository;

import com.example.userbackup.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}