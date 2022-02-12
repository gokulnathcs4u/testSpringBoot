package com.cicdexample.cicdexample.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {
    @GetMapping(value = "/")
    public String getMethodName() {
        return "Test";
    }

}
