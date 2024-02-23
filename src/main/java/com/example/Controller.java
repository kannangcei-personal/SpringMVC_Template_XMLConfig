package com.example;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/home")
    public String displayHome(){
        return "home";
    }

    @GetMapping("/")
    public String displayIndex(){
        return "index";
    }

}
