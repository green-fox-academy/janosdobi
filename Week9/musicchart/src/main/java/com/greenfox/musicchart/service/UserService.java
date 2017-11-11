package com.greenfox.musicchart.service;

import com.greenfox.musicchart.model.User;
import com.greenfox.musicchart.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public void addUser(User u) {
        userRepo.save(u);
    }

    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void deleteUser(Long id) {
        userRepo.delete(id);
    }

    public User getUser(Long id) {
        return userRepo.findOne(id);
    }
}