package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong atomicID = new AtomicLong(1);

    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam(value = "name") String name) {
        atomicID.incrementAndGet();
        return new Greeting(atomicID.longValue(), name);
    }
}