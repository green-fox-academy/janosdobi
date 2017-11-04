package com.greenfox.todolistmysql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public Todo(String title) {
        this.title = title;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @ManyToOne
    private Assignee assignee;
}
