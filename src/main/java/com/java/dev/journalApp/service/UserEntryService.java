package com.java.dev.journalApp.service;

import java.util.List;
import java.util.Optional;

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

public List<UserEntry> getALL()
{
    return repo.findAll();
}






public Optional<UserEntry> getbyid(String id)
{
    return repo.findByEmail(id);
}


public void deletebyid(String id)
{
    repo.deleteById(id);
    
    
}













}