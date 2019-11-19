package com.codeclan.example.userfilesmanagement.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name ;

    @OneToMany(mappedBy = "folder")
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
