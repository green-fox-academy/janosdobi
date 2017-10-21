package com.greenfox;

import java.time.LocalDateTime;

public class Task {

    private String name;
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    public Task(String name, int id, LocalDateTime d) {
        this.name = name;
        this.id = id;
        createdAt = d;
        completedAt = createdAt;
    }

    public void setCompletedAt(LocalDateTime d) {
        this.completedAt = d;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public boolean isCompleted() {
        if (!completedAt.isEqual(createdAt)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public int completionTime () {
        return completedAt.getDayOfYear() - createdAt.getDayOfYear();
    }

    @Override
    public String toString() {
        return id + " - " + (!isCompleted() ? "[ ] " : "[x] ") + name;
    }
}