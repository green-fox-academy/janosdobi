package com.greenfox.restproject.controllers;

import com.greenfox.restproject.model.Doubler;
import com.greenfox.restproject.model.Errormessage;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class DoubleController {

    @ExceptionHandler(Exception.class)
    public Errormessage error() {
        return new Errormessage("Please provide an input!");
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Doubler doubling(@RequestParam(value="input", required = false) int received) {
        return new Doubler(received);
    }
}