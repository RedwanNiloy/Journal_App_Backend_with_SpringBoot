package com.java.dev.journalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dev.journalApp.entity.UserEntry;
import com.java.dev.journalApp.repository.UserEntryRepo;





@Service
public class UserEntryService{

@Autowired
private UserEntryRepo repo;

public String createuser(UserEntry entry){
    
    repo.save(entry);
    
    return "Saved";

         
    
}










}