package com.java.dev.journalApp.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;







@Data
@Document(collection="users")
public class UserEntry{
@Id
private String id;
@NonNull
private String name;
@NonNull
private String password;
@NonNull
@Indexed(unique=true)
private String email;
@DBRef
private List<JournalEntry> journalentries = new ArrayList<>();
   




}