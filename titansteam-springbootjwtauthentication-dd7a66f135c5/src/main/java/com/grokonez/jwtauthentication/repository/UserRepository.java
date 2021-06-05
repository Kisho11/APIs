package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

    void delete(User user);

    List findAll();

    User findOne(int id);

    User save(User user);
}