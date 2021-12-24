package com.interns.ci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("controller/hello")
    public String sayHello(){
        return "Hello from Rest Controller from Heroku CI Flow 111dd";
    }
}
