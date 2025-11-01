package com.example.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String great(){
        System.out.println("im here...");
        return  "Welcome to spring";
    }

    @RequestMapping("/about")
    public String about(){
        return  "This is the about page";
    }
}
