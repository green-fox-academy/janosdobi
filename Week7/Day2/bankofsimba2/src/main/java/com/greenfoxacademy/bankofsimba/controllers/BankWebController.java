package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.Bank;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankWebController {

    @Autowired
    Bank bank;

    @Autowired
    BankAccount account;

    @RequestMapping(value="/exercise1")
    public String bankAccount(Model model) {
        model.addAttribute("account", account);
        return "exercise1";
    }

    String myText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

    @RequestMapping(value="/HTMLception")
    public String htmlCeption(Model model) {
            model.addAttribute("text", myText);
        return "HTMLCeption";
    }


    @GetMapping(value={"/", ""})
    public String multiple(Model model) {
        model.addAttribute("accounts", bank.getAccounts());
        return "multiple";
    }

    @PostMapping(value="/raise")
    public String balanceRaise(@ModelAttribute BankAccount account) {
        bank.raiseTheBalance(account);
        return "redirect:/";
    }
}