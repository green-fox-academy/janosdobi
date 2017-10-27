package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    Fox fox;

    @GetMapping(value={"", "/"})
    public String index(Model model) {
        model.addAttribute("fox", fox);
        return "index";
    }

    @GetMapping(value="/nutrition")
    public String nutrition() {
        return "nutrition";
    }
}