package com.java.dev.journalApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dev.journalApp.entity.JournalEntry;
import com.java.dev.journalApp.repository.JournalEntryRepo;



@Service
public class JournalEntryService{


@Autowired
 private JournalEntryRepo journalreop;

  
 public void saveEntry(JournalEntry entry)
{
     journalreop.save(entry);
}

public List<JournalEntry> getALL()
{
    return journalreop.findAll();
}






}