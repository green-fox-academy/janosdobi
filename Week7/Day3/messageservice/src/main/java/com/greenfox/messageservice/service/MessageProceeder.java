package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

    @Autowired
    MessageService myService;

    public void processMessage(String message, String address) {
        myService.sendMessage(message, address);
    }
}