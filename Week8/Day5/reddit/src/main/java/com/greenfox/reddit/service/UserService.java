package com.greenfox.reddit.service;

import com.greenfox.reddit.model.User;
import com.greenfox.reddit.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepo userrepo;

    public Iterable<User> listAllUsers() {
        return userrepo.findAll();
    }

    public String loginUser(String name, User user) {
        if(user.getPassword().equals(userrepo.findUserByName(name).getPassword())){
            return "posts/user?id=" + user.getId();
        } else {
            return "";
        }
    }

    public void addnewUser(User user){
        userrepo.save(user);
    }

    public User findOne(Long id) {
        return userrepo.findOne(id);
    }



}