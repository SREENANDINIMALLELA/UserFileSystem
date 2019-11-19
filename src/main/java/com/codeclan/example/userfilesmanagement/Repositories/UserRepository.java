package com.codeclan.example.userfilesmanagement.Repositories;

     import com.codeclan.example.userfilesmanagement.models.User;
        import org.springframework.data.jpa.repository.JpaRepository;
     import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
}
