package com.java.dev.journalApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

@PostMapping("/create")
public void createUser(@RequestBody UserEntry entry){

             service.createuser(entry);

}

@GetMapping("/getall")
    public List<UserEntry> getAll(){
        
        return service.getALL();
        
       // return new ArrayList<>(journalEntries.values());
        
    }


@GetMapping("/email/{email}")
    public Optional<UserEntry> getbyID(@PathVariable String email){
       
        return service.getbyid(email);
    }


    @DeleteMapping("/delete/email/{email}")
    public String deleteID(@PathVariable String email)
    {
       service.deletebyid(email);
       return "deleted";

    }








}
