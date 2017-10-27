package com.greenfox.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value={"", "/"})
    public String index(Model model) {
        model.addAttribute("fox");
        return "index";
    }
}