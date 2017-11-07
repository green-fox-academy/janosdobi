
package com.greenfox.restproject.controllers;

import com.greenfox.restproject.model.DoUntil;
import com.greenfox.restproject.model.Errormessage;
import com.greenfox.restproject.model.Until;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @ExceptionHandler(Exception.class)
    public Errormessage error() {
        return new Errormessage("Please provide a number!");
    }

    @PostMapping("/dountil/{what}")
    public DoUntil doUntil(
            @PathVariable String what, @RequestBody Until until) {

        DoUntil doUntil = new DoUntil(what, until);

        return doUntil;
    }

}