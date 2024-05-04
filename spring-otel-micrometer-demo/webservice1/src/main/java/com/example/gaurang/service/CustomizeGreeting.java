package com.example.gaurang.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class CustomizeGreeting {

    private final RestTemplate restTemplate;

    @Value("${customize.greeting.service}")
    private String customizeServiceURL;

    public CustomizeGreeting(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String customizeGreeting(String name){
        String uri = customizeServiceURL + "name=" + name;
        log.info("customize url= {}", uri);
        return this.restTemplate.getForObject(uri, String.class);
    }
}
