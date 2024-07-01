package com.learn.springboot.through_tutorials_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LetsStartLearningController {

    // HTTP GET Request
    // http://localhost:8080/welcome
    @GetMapping("/welcome")
    public String welcomeToLearning() {
        return "Welcome to REST API Learning!";
    }
}
