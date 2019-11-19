package com.codeclan.example.userfilesmanagement.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class User {
    @Id
    @GeneratedValue()
    private Long id;
    private String name ;
    List<Folder> folders;

    public User(String name) {
        this.name = name;
        this.folders=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
    public void addFolder(Folder folder){
        this.folders.add( folder);
    }
}
