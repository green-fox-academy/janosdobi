package com.greenfox.reddit.repositories;

import com.greenfox.reddit.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {

    @Query(value="SELECT * FROM post ORDER BY score DESC LIMIT 10 OFFSET ?1", nativeQuery = true)
    Iterable<Post> getPostsByPage(int pageId);
}