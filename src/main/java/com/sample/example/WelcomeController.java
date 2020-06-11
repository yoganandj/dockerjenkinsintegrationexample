package com.sample.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/")
    public String getWelcome(){
        return "Hello,user welcome to Docker World";
    }
}
