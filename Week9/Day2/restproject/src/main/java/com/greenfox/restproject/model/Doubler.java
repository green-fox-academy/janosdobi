package com.greenfox.restproject.model;

public class Doubler {

    private int received;
    private int result;
    private String error;

    public Doubler(int received) {
        this.received = received;
        this.result = received * 2;
    }

    public int getReceived() {
        return received;
    }

    public int getResult() {
        return result;
    }
}