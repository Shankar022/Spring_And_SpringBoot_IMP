package com.shankar.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//        scanBasePackages = {"com.shankar.springcoredemo",
//                "com.shankar.util"}
//)

@SpringBootApplication
public class SpringcoredemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcoredemoApplication.class, args);
    }

}
