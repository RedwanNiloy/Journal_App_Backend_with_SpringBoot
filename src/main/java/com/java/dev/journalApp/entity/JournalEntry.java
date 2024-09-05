package com.java.dev.journalApp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


//nIce


@Data //this annotation generate getter setters constructir etc in compile time
@Document(collection="jounral_entries")
public class JournalEntry{

    @Id
    private String id;
    private String title;
    private String content;

   /*  public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }*/
    




}
