package com.greenfox.todolistmysql.controllers;

import com.greenfox.todolistmysql.model.Assignee;
import com.greenfox.todolistmysql.repositories.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {

    @Autowired
    private AssigneeRepo assignees;

    @GetMapping({"/", ""})
    public String assignees(Model model) {
        model.addAttribute("assignees", assignees.findAll());
        model.addAttribute("assignee", new Assignee());
        return "assignees";
    }

    @PostMapping("/newAssignee")
    public String newAssignee(@ModelAttribute Assignee assignee) {
        assignees.save(assignee);
        return "redirect:/assignees";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        assignees.delete(id);
        return "redirect:/assignees";
    }

    @GetMapping("/{id}/editAssignee")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("assignee", assignees.findOne(id));
        return "editAssignee";
    }

    @PostMapping("/{id}/editAssignee")
    public String update(Assignee assignee) {
        assignees.save(assignee);
        return "redirect:/assignees";
    }
}