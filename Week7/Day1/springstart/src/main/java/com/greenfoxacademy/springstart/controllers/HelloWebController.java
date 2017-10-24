package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong id = new AtomicLong(1);

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public String getColour() {
        return String.format("color:rgb(%d,%d,%d)", (int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    }

    public String getSize() {
        return String.format("font-size:%dpx", (int) (12 + Math.random() * 60));
    }

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        id.incrementAndGet();
        model.addAttribute("id", id);
        model.addAttribute("hello", String.format("%s", hellos[(int) (Math.random() * 45)]));
        model.addAttribute("style", getColour() + ";" + getSize());
        return "greeting";
    }
}