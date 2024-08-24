package com.java.dev.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.java.dev.journalApp.entity.UserEntry;


@Repository
public interface UserEntryRepo extends MongoRepository<UserEntry,String>{

    






    
}
