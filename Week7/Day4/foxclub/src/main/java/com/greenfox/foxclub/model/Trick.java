package com.greenfox.foxclub.model;

public class Trick {

    private String name;

    public Trick(){
    }

    public Trick(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}