package com.greenfox.musicchart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String author;
    private String title;
    private long likes;

    @ManyToMany
    private List<User> users;

    public void addLike(User user) {
        users.add(user);
        likes++;
    }

    @Override
    public String toString() {
        return author + " " + title;
    }
}