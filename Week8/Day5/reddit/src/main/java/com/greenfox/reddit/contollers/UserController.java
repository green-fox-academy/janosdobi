package com.greenfox.reddit.contollers;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.model.User;
import com.greenfox.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping({"/", ""})
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @GetMapping("/register")
    public String adduser(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute User user) {
        userService.addnewUser(user);
        return "redirect:";
    }

    @GetMapping("/unauthorized/")
    public String unauthorized() {
        return "unauthorized";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user) {
        return "redirect:/" + userService.loginUser("Jani", user);
    }
}