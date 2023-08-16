package com.tran.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tran.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
     @Query(value="select * from user where email = ?1 and password = ?2", nativeQuery = true)
    public User signIn(String email, String password);

    @Query(value="select * from user where email = ?1", nativeQuery = true) //make sure field matches database exactly
    public User findByEmail(String email);

}
