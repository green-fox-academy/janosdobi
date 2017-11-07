package com.greenfox.restproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    @ResponseBody
    public String doubling(@RequestParam(value="input", defaultValue = "0") Long received) {
        String error = "Please provide an input!";
        if(!(received == 0)) {
            Long result = received * 2;
            return String.valueOf(result);
        } else {
            return error;
        }
    }
}
