package com.codeclan.example.userfilesmanagement.Repositories;

        import com.codeclan.example.userfilesmanagement.Projections.EmbedFile;
        import com.codeclan.example.userfilesmanagement.Projections.EmbedFolder;
        import com.codeclan.example.userfilesmanagement.models.Folder;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;
        import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository  extends JpaRepository<Folder, Long> {
}
