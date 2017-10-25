package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankWebController {

    List<String> names = Arrays.asList("Scar", "Timon", "Pumba", "Rafiki", "Mufasa");
    List<Double> money = Arrays.asList(1000.00, 0.00, 0.00, 5000.00, 10000.00);
    List<String> types = Arrays.asList("lion", "rat", "pig", "monkey", "lion");

    @RequestMapping(value="/exercise1")
    public String bankAccount(Model model) {
        model.addAttribute("account", new BankAccount("Simba", 2000.00, "lion", false));
        return "exercise1";
    }

    String myText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

    @RequestMapping(value="/HTMLception")
    public String htmlCeption(Model model) {
            model.addAttribute("text", myText);
        return "HTMLCeption";
    }

    @RequestMapping(value="/multiple")
    public String multiple(Model model) {
        model.addAttribute("accounts", getAccounts());
        model.addAttribute("feri", "Ferike");
        return "multiple";
    }

    public List<BankAccount> getAccounts() {
        List<BankAccount> accounts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            accounts.add(new BankAccount(names.get(i), money.get(i), types.get(i), false));
            if (accounts.get(i).getName().equals("Mufasa")) {
                accounts.get(i).setKing(true);
            }
        }
        return accounts;
    }
}