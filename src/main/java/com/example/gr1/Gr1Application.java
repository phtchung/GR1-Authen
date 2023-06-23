package com.example.gr1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Gr1Application {

    public static void main(String[] args) {
        SpringApplication.run(Gr1Application.class, args);
    }

}
