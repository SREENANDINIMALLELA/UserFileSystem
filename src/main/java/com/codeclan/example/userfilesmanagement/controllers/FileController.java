package com.codeclan.example.userfilesmanagement.controllers;

import com.codeclan.example.userfilesmanagement.Repositories.FileRepository;
import com.codeclan.example.userfilesmanagement.models.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(value="/files")
public class FileController {


        @Autowired
        FileRepository fileRepository;
        //get all pirates
        @GetMapping
        public List<File> getAllPirates(){
            return  fileRepository.findAll();
        }
        @GetMapping("{id}")
        // returns if id is present and nul if id not present in the table
        public Optional<File> getPirate(@PathVariable Long id){
            return  fileRepository.findById(id);
        }



}
