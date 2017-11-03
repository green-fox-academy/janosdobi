package com.greenfox.reddit.service;

import com.greenfox.reddit.model.User;
import com.greenfox.reddit.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepo userrepo;

    public String loginUser(String name, User user) {
        if(user.getPassword().equals(userrepo.findUserByName(name).getPassword())){
            return "posts/";
        } else {
            return "unauthorized/";
        }
    }

    public void addnewUser(User user){
        userrepo.save(user);
    }

}
