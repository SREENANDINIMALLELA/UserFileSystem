package com.codeclan.example.userfilesmanagement.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name ;

    @JsonIgnoreProperties("users")
    @OneToMany(mappedBy = "user")
    List<Folder> folders;

    public User(String name) {
        this.name = name;
        this.folders=new ArrayList<>();
    }

    public User() {
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
