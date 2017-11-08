package com.greenfox.guardians.controllers;

import com.greenfox.guardians.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @Autowired
    Ship ship;

    @ExceptionHandler(ArithmeticException.class)
    public GuardianError divideByZero() {
        return new GuardianError("Time cannot be zero!");
    }

    @GetMapping("/groot")
    public Object groot(@RequestParam(value = "message", required = false, defaultValue = "") String message) {
        if (!message.equals("")) {
            return new Groot(message);
        } else {
            return new GuardianError("I am Groot!");
        }
    }

    @GetMapping("/yondu")
    public Yondu yondu(@RequestParam("distance") long distance, @RequestParam("time") long time) {
        return new Yondu(distance, time);
    }

    @GetMapping("/rocket")
    public Ship shipsCargo() {
        return ship;
    }

    @GetMapping("/rocket/fill")
    public Cargo fill(@RequestParam("caliber") String caliber, @RequestParam("amount") Integer amount) {
        return new Cargo(caliber, amount);
    }
}