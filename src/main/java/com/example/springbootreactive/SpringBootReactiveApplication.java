package com.example.springbootreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class SpringBootReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReactiveApplication.class, args);
    }

}
