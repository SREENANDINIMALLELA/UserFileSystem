package com.codeclan.example.userfilesmanagement.Repositories;

     import com.codeclan.example.userfilesmanagement.Projections.EmbedFile;
     import com.codeclan.example.userfilesmanagement.Projections.EmbedUser;
     import com.codeclan.example.userfilesmanagement.models.User;
        import org.springframework.data.jpa.repository.JpaRepository;
     import org.springframework.data.rest.core.annotation.RepositoryRestResource;
     import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface UserRepository extends JpaRepository<User, Long>  {
}
