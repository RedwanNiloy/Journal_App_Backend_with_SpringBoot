package com.java.dev.journalApp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.dev.journalApp.entity.JournalEntry;





@RestController //special type of component who handles http method
@RequestMapping("/journal")
public class JournalEntryController{
    private Map<Long,JournalEntry> journalEntries= new HashMap<>();

    


    @GetMapping("/getall")
    public List<JournalEntry> getAll(){

        return new ArrayList<>(journalEntries.values());
        
    }


    @PostMapping("/createentry")
    public void createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);
    

    }

    @GetMapping("/id/{myID}")
    public JournalEntry getbyID(@PathVariable Long myID){
           return journalEntries.get(myID);

    }


    @DeleteMapping("/delete/id/{myID}")
    public boolean deleteID(@PathVariable Long myID)
    {
        journalEntries.remove(myID);
        return true;

    }



    @PutMapping("/update/id/{id}")
    public boolean updateID(@PathVariable long id ,@RequestBody JournalEntry js)
    {

        journalEntries.put(id,js);
        return true;
    } 



    

}