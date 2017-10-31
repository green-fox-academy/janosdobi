package com.greenfox.listingtodos.controllers;

import com.greenfox.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepository todorepo;

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todorepo.findAll());
        return "todo";
    }
}