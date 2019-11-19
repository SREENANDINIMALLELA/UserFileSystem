package com.codeclan.example.userfilesmanagement.controllers;

import com.codeclan.example.userfilesmanagement.Repositories.FolderRepository;
import com.codeclan.example.userfilesmanagement.models.File;
import com.codeclan.example.userfilesmanagement.models.Folder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/folders")
public class FolderController {
    @Autowired
    FolderRepository folderRepository;
    @GetMapping
    public List<Folder> getAllPirates(){
        return  folderRepository.findAll();
    }
    @GetMapping("{id}")
    // returns if id is present and nul if id not present in the table
    public Optional<Folder> getPirate(@PathVariable Long id){
        return  folderRepository.findById(id);
    }


}
