package com.java.dev.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.java.dev.journalApp.entity.JournalEntry;




@Repository
public interface JournalEntryRepo extends MongoRepository<JournalEntry,String>{

    












}