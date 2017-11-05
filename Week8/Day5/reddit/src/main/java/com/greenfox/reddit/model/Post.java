package com.greenfox.reddit.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int score;
    private String content;
    private LocalDateTime postDate;

    @ManyToOne
    private User user;

    public Post() {
        postDate = LocalDateTime.now();
    }

    public Post(int score, String content, LocalDateTime postDate) {
        this.score = score;
        this.content = content;
        this.postDate = postDate;
    }
}
