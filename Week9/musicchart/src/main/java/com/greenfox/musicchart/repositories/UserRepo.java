package com.greenfox.musicchart.repositories;

import com.greenfox.musicchart.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}