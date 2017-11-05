package com.greenfox.reddit.repositories;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {

    @Query(value="SELECT * FROM post ORDER BY score DESC LIMIT 10 OFFSET ?1", nativeQuery = true)
    Iterable<Post> getPostsByPage(int pageId);

    @Query(value="SELECT * FROM post WHERE user_id = ?1 ORDER BY score DESC LIMIT 10 OFFSET ?2", nativeQuery = true)
    Iterable<Post> getPostsByUser(Long userId, int pageId);
}