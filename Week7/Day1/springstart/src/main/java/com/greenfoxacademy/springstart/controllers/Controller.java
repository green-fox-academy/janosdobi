package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value="/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

}
