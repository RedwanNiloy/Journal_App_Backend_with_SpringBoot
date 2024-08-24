package com.java.dev.journalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.dev.journalApp.entity.UserEntry;
import com.java.dev.journalApp.service.UserEntryService;





@RestController
@RequestMapping("/user")

public class UserEntryController{

@Autowired
private UserEntryService service;

@GetMapping("/create")
public void createUser(@RequestBody UserEntry entry){

             service.createuser(entry);

}



}
