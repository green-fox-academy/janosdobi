package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Drink;
import com.greenfox.foxclub.model.Food;
import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    Fox fox;

    @Autowired
    Food food;

    @Autowired
    Drink drink;

    @Autowired
    Trick trick;

    @GetMapping(value={"", "/"})
    public String index(Model model) {
        model.addAttribute("fox", fox);
        return "index";
    }

    @GetMapping(value="/nutrition")
    public String nutrition(Model model) {
        model.addAttribute("food", food);
        model.addAttribute("drink", drink);
        return "nutrition";
    }

    @PostMapping(value="/changeFood")
    public String foodChange(@ModelAttribute Food food) {
        fox.setFood(food);
        return "redirect:/";
    }

    @PostMapping(value="/changeDrink")
    public String drinkChange(@ModelAttribute Drink drink) {
        fox.setDrink(drink);
        return "redirect:/";
    }

    @GetMapping("/tricks")
    public String tricks(Model model) {
        model.addAttribute("trick" );
        return "tricks";
    }

    @PostMapping
    public String learnTrick(@ModelAttribute Trick trick) {
        fox.learnTrick(trick);
        return "redirect:/";
    }
}