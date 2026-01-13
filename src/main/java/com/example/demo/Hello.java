package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello(){
        return "Aapka swagat h";
    }
    @GetMapping("/home")
    public String home(){
        return "This is home";
    }
    @GetMapping("/about")
    public String about(){
        return "This is About";
    }
}
