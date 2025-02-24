package com.example.hellogithubactions.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/welcome")
        public String welcome(){
        return "welcome";
        }

}
