package com.java.dev.journalApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dev.journalApp.entity.JournalEntry;
import com.java.dev.journalApp.entity.UserEntry;
import com.java.dev.journalApp.repository.JournalEntryRepo;
import com.java.dev.journalApp.repository.UserEntryRepo;



@Service
public class JournalEntryService{


@Autowired
 private JournalEntryRepo journalreop;

 @Autowired 
 private UserEntryService js;

 @Autowired
 private UserEntryRepo repo;

 

  
 public void saveEntry(JournalEntry entry, String email)
{
     JournalEntry saved =journalreop.save(entry);

     Optional<UserEntry> us= repo.findByEmail(email);

    UserEntry user =us.get();

    user.getJournalentries().add(saved);
    js.createuser(user);

     
     
     


     



}

public List<JournalEntry> getALL()
{
    return journalreop.findAll();
}


public Optional<JournalEntry> getbyid(String id)
{
    return journalreop.findById(id);
}


public void deletebyid(String id)
{
    journalreop.deleteById(id);
}








}