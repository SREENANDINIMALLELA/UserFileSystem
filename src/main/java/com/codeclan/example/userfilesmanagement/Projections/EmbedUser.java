package com.codeclan.example.userfilesmanagement.Projections;

import com.codeclan.example.userfilesmanagement.models.Folder;
import com.codeclan.example.userfilesmanagement.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser",types= User.class)
public interface EmbedUser {
    String getName();
    List<Folder> getFolders();
}
