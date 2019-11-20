package com.codeclan.example.userfilesmanagement.Projections;

import com.codeclan.example.userfilesmanagement.models.File;
import com.codeclan.example.userfilesmanagement.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile",types= File.class)
public interface EmbedFile {
    String getName();
    int gerSize();
    Folder getFolder();

}
