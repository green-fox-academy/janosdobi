package com.greenfox.restproject.model;

public class Appenda {

    private String appended;

    public Appenda(String input) {
        appended = input.concat("a");
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }

    @Override
    public String toString() {
        return appended;
    }
}