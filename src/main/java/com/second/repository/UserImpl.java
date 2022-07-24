package com.second.repository;

import com.second.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class UserImpl{
    @Autowired
    UserRepository repo;
    public void save(User newUser) {
         repo.save(newUser);
    }
}
