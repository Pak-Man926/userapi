package com.example.userapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/hello")
    public String hello()
    {
        return "Hey there, API world 🌍!";
    }

    @GetMapping("/test")
    public String test()
    {
        return "Test API is working!";
    }
    
}
