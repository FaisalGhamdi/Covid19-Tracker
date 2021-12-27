package com.faisalghamdi.covid19tracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("covid")
public class MainController {

    @GetMapping
    public String testAPI(@PathVariable String word){
        return "API is working!";
    }
}
