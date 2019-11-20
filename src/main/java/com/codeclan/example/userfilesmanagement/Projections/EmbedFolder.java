package com.codeclan.example.userfilesmanagement.Projections;

import com.codeclan.example.userfilesmanagement.models.File;
import com.codeclan.example.userfilesmanagement.models.Folder;
import com.codeclan.example.userfilesmanagement.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder",types= Folder.class)
public interface EmbedFolder {
    String getTitle();
    User getUser();
    List<File> getFiles();
}
