package com.greenfox.reddit.repositories;

import com.greenfox.reddit.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

    User findUserByName(String name);

}