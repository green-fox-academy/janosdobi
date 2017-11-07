package com.greenfox.restproject.controllers;

import com.greenfox.restproject.model.Appenda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendController {

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Appenda appenda(@PathVariable String appendable) {
        return new Appenda(appendable);
    }
}