package com.java.dev.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthCheck{
    @GetMapping("/healthcheck")
    public String healthCheck(){
        System.out.println("health called");
        return "ok";
    }


}