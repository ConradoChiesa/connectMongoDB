package com.example.userbackup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class UserBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserBackupApplication.class, args);
    }

}
