package com.codeclan.example.userfilesmanagement.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id ;

    @Column(name="title")
    private String title;
    @Column(name="user")
    private User user;

    @OneToMany(mappedBy = "file")
    private List<File> files;

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
        this.files=new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
    public void addFile(File file){
        this.files.add(file);
    }
}
