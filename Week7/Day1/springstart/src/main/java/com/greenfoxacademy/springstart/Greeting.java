package com.greenfoxacademy.springstart;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Greeting {

    @Getter
    private long id;
    @Getter
    private String content;

}