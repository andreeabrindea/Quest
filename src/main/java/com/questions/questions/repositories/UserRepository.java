package com.questions.questions.repositories;

import com.questions.questions.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.name=?1")
    Optional <User> findByName(String name);

    @Query("select u from User u where u.email=?1")
    Optional <User> findByEmail(String email);

    @Query("select u from User u where u.name=?1 and u.password=?2")
    Optional<User> findByNameAndPassword(String name, String password);

}
