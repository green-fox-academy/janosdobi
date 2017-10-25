package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankWebController {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

    @RequestMapping(value="/exercise1")
    public String bankAccount(Model model) {
        model.addAttribute("name", bankAccount.getName());
        model.addAttribute("balance", String.format("%.2f Zebra", (double) bankAccount.getBalance()));
        model.addAttribute("animalType", bankAccount.getAnimalType());
        return "exercise1";
    }

    String myText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

    @RequestMapping(value="/HTMLception")
    public String htmlCeption(Model model) {
            model.addAttribute("text", myText);
        return "HTMLCeption";
    }
}