package com.greenfox.foxclub.model;

public class Drink {

    private String name;

    public Drink() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}