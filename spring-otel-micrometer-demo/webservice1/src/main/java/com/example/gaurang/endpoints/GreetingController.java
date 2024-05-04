package com.example.gaurang.endpoints;
import org.springframework.web.bind.annotation.RestController;

import com.example.gaurang.service.CustomizeGreeting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private CustomizeGreeting customizeGreeting;

    private GreetingController(CustomizeGreeting customizeGreeting){
        this.customizeGreeting = customizeGreeting;
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name) {
        return customizeGreeting.customizeGreeting(name);
    }



}
