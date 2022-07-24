package com.second.service;

import com.second.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    void addUser(User user);
    void editUser(User user);
    void deleteUser(UUID id);
    List<User> getUser();
}
