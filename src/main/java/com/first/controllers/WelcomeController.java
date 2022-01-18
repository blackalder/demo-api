package com.first.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome to spring";
    }

    @PostMapping
    public String other(){
        return "asfdafg";
    }
}
