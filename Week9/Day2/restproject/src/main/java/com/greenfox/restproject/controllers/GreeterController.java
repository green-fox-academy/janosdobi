package com.greenfox.restproject.controllers;

import com.greenfox.restproject.model.Errormessage;
import com.greenfox.restproject.model.Greeter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @ExceptionHandler(Exception.class)
    public Errormessage error(){
        return new Errormessage("Please provide a name!");
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greeter greeter(@RequestParam(value="name") String name,
                           @RequestParam(value="title") String title) {
        return new Greeter(name, title);
    }
}