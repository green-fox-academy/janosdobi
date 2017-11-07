package com.greenfox.restproject.controllers;

import com.greenfox.restproject.exceptions.MissingNameException;
import com.greenfox.restproject.exceptions.MissingTitleException;
import com.greenfox.restproject.model.Errormessage;
import com.greenfox.restproject.model.Greeter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @ExceptionHandler(MissingNameException.class)
    public Errormessage nameError(){
        return new Errormessage("Please provide a name!");
    }

    @ExceptionHandler(MissingTitleException.class)
    public Errormessage titleError(){
        return new Errormessage("Please provide a title!");
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greeter greeter (@RequestParam(value="name", required = false, defaultValue = "") String name,
                           @RequestParam(value="title", required = false, defaultValue = "") String title) throws MissingTitleException, MissingNameException {
        if (name.equals("")) {
            throw new MissingNameException();
        } else if (title.equals("")) {
            throw new MissingTitleException();
        } else {
            return new Greeter(name, title);
        }
    }
}