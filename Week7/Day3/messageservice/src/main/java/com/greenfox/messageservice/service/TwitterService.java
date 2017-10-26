package com.greenfox.messageservice.service;

public class TwitterService implements MessageService {

    private String message;
    private String address;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void sendMessage(String message, String address) {
        System.out.printf("Tweet Sent to %s with Message=%s?", message, address);
        System.out.println();
    }
}