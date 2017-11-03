package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;


public class PostService {

    @Autowired
    private PostRepo postrepo;

    public Iterable<Post> listAllPosts() {
        return postrepo.listTopTen();
    }

    public void addNewPost(Post post) {
        postrepo.save(post);
    }

    public void upvotePost(Long id) {
        Post upvotedPost = postrepo.findOne(id);
        upvotedPost.setScore(upvotedPost.getScore() + 1);
        postrepo.save(upvotedPost);
    }

    public void downvotePost(Long id) {
        Post downvotedPost = postrepo.findOne(id);
        downvotedPost.setScore(downvotedPost.getScore() - 1);
        postrepo.save(downvotedPost);
    }

}