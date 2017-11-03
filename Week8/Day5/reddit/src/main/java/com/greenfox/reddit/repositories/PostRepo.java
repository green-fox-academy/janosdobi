package com.greenfox.reddit.repositories;

import com.greenfox.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
}