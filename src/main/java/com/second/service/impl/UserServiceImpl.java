package com.second.service.impl;

import com.second.model.User;
import com.second.repository.UserRepository;
import com.second.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    //Define the body of interface here in service
    @Override
    public void addUser(User user) {

    }

    @Override
    public void editUser(User user) {

    }

    @Override
    public void deleteUser(UUID id) {

    }

    @Override
    public void getUser() {

    }
}
