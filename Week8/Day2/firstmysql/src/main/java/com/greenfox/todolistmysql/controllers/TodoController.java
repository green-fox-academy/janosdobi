package com.greenfox.todolistmysql.controllers;

import com.greenfox.todolistmysql.model.Todo;
import com.greenfox.todolistmysql.repositories.AssigneeRepo;
import com.greenfox.todolistmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepository todorepo;

    @Autowired
    private AssigneeRepo assignees;

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todorepo.findAll());
        model.addAttribute("assignees", assignees.findAll());
        return "todo";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("todo", new Todo());
        return "create";
    }

    @GetMapping("/byTitle/{title}")
    public String search(@RequestParam(value = "title") String title) {
        todorepo.findByTitle(title);
        return "redirect:/todo/list";
    }

    @PostMapping("/add")
    public String greetingSubmit(@ModelAttribute Todo todo) {
        todorepo.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        todorepo.delete(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todorepo.findOne(id));
        model.addAttribute("assignees", assignees.findAll());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String update(@ModelAttribute Todo todo){
        todorepo.save(todo);
        return "redirect:/todo/list";
    }
}