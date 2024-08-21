package com.java.dev.journalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.dev.journalApp.entity.JournalEntry;
import com.java.dev.journalApp.service.JournalEntryService;





@RestController //special type of component who handles http method
@RequestMapping("/journal")
public class JournalEntryController2{
   // private Map<Long,JournalEntry> journalEntries= new HashMap<>();
    @Autowired
    private JournalEntryService js;


    @GetMapping("/getall")
    public List<JournalEntry> getAll(){
        
        return js.getALL();
        
       // return new ArrayList<>(journalEntries.values());
        
    }


    @PostMapping("/createentry")
    public String createEntry(@RequestBody JournalEntry myEntry){
        
       js.saveEntry(myEntry);
       return "saved";

    }

    @GetMapping("/id/{myID}")
    public JournalEntry getbyID(@PathVariable Long myID){
       
        return null;
    }


    @DeleteMapping("/delete/id/{myID}")
    public boolean deleteID(@PathVariable Long myID)
    {
       return true;

    }



    @PutMapping("/update/id/{id}")
    public boolean updateID(@PathVariable long id ,@RequestBody JournalEntry js)
    {
     

        return false;
      
    } 



    

}