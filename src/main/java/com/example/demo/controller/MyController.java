package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Ajit Shiwankar";
    }

    @GetMapping("/string")
    public String get() {
        return "I love my country. I love me you";
    }
}
