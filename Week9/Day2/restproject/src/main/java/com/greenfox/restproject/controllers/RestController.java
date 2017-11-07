package com.greenfox.restproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/doubling")
    @ResponseBody
    public String doubling(@RequestParam(value="input", required = false) Long received) {
        String error = "Please provide an input!";
        try {
            Long result = received * 2;
            return String.valueOf(result);
        } catch (NullPointerException e){
            return error;
        }
    }

    @GetMapping("/greeter")
    @ResponseBody
    public String greeter(@RequestParam(value="name", required = false) String name,
                          @RequestParam(value="title", required = false) String title) {
        String welcome_message = String.format("Oh, hi there %s, my dear %s!", name, title);
        String error = "Please provide a name!";
        try {
            return welcome_message;
        } catch(NullPointerException e) {
            return error;
        }
    }

    

}
