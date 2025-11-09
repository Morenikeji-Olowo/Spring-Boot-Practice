package com.example.springSec.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public  String Greet(HttpServletRequest request){
        return ("welcome to spring security" + request.getSession().getId());
    }
}
