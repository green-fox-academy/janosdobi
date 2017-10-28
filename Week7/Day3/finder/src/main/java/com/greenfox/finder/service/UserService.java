package com.greenfox.finder.service;

import com.greenfox.finder.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * Created by aze on 25/10/17.
 */

@Configuration
public class UserService {

    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    @Bean
    public UserService service() {
        return new UserService();
    }

    @Bean
    public User user() {
        return new User();
    }
}
