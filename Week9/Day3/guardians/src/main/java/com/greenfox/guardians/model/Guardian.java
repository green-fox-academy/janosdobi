package com.greenfox.guardians.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Guardian {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToMany
    private List<Song> songs;

    @Override
    public String toString() {
        return name;
    }
}