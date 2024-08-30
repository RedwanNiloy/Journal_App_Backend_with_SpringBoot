package com.java.dev.journalApp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.java.dev.journalApp.entity.UserEntry;


@Repository
public interface UserEntryRepo extends MongoRepository<UserEntry,String>{

    public Optional<UserEntry> findByEmail(String email);






    
}
