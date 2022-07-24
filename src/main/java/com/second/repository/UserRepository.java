package com.second.repository;

import com.second.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(UUID l);
    User findByUsername(String n);

}

