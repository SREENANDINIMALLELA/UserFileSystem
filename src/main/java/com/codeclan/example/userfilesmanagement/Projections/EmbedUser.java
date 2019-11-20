package com.codeclan.example.userfilesmanagement.Projections;

import com.codeclan.example.userfilesmanagement.models.Folder;
import com.codeclan.example.userfilesmanagement.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser",types= User.class)
public interface EmbedUser {
}
