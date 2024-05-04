package com.example.gaurang.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/customizegreeting")
public class CustomizedGreetingController {
 
    @GetMapping("")
    public String getMethodName(@RequestParam String name) {
        return String.format("Good morning %s", name);
    }
        
}
