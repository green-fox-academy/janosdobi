package com.greenfox.reddit.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int score;
    private String content;
    private LocalDate postDate;

    public Post() {
        postDate = LocalDate.now();
    }

    public Post(int score, String content, LocalDate postDate) {
        this.score = score;
        this.content = content;
        this.postDate = postDate;
    }
}
