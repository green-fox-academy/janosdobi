package com.greenfox.restproject.model;

public class Greeter {

    private String welcome_message;

    public Greeter(String name, String title) {
        welcome_message = String.format("Oh, hi there %s, my dear %s!", name, title);
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}