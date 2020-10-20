package com.IntegratedProject.SpringIntegrated.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping
    public String home(){
        return "This is the Spring Boot backend to my online portfolio.";
    }

}