package com.greenfox.finder.controller;

import com.greenfox.finder.model.User;
import com.greenfox.finder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */

@Controller
public class AppController {

    @Autowired
    UserService service;

    @Autowired
    User user;

    @GetMapping(value={"/", ""})
    public String index(Model model) {
        model.addAttribute("user", user);
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute User user) {
        service.save(user);
        return "redirect:/";
    }
}