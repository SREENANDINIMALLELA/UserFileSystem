package com.codeclan.example.userfilesmanagement.Repositories;

import com.codeclan.example.userfilesmanagement.Projections.EmbedFile;
import com.codeclan.example.userfilesmanagement.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
