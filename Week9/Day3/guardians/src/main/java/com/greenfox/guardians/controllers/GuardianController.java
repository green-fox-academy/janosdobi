package com.greenfox.guardians.controllers;

import com.greenfox.guardians.model.Groot;
import com.greenfox.guardians.model.GuardianError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping("/groot")
    public Object groot(@RequestParam(value = "message", required = false, defaultValue = "") String message) {
        if (!message.equals("")) {
            return new Groot(message);
        } else {
            return new GuardianError("I am Groot!");
        }
    }
}