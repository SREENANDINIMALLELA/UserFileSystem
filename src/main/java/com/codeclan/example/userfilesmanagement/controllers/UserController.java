package com.codeclan.example.userfilesmanagement.controllers;

import com.codeclan.example.userfilesmanagement.Repositories.UserRepository;
import com.codeclan.example.userfilesmanagement.models.Folder;
import com.codeclan.example.userfilesmanagement.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/users")
public class UserController {
   @Autowired
    UserRepository userRepository;
//    @GetMapping
//    public List<User> getAllPirates(){
//        return   userRepository.findAll();
//    }
//    @GetMapping("{id}")
//    // returns if id is present and nul if id not present in the table
//    public Optional<User> getPirate(@PathVariable Long id){
//        return   userRepository.findById(id);
//    }

}
