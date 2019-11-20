package com.codeclan.example.userfilesmanagement.Projections;

import com.codeclan.example.userfilesmanagement.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder",types= Folder.class)
public interface EmbedFolder {

}
