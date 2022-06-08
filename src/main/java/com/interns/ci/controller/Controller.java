package com.interns.ci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("controller/hello")
    public String sayHello(){
        return "Hello from Rest Controller deployed from Github Action to Heroku " +
                "</br> Feature branch merged into master using pull request" +
                "</br> Build docker image." +
                "</br> Feature to DEV ENV Automatic Deployment." +
                "</br> Dev to Stage ENV Automatic Deployment after 3 min" +
                "</br> Dev to Stage ENV Automatic Deployment after 2 min";
    }
}
