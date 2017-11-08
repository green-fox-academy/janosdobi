package com.greenfox.restproject.controllers;


import com.greenfox.restproject.model.*;
import com.greenfox.restproject.repositories.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ErrorMessage notReadableError() {
        return new ErrorMessage("Please provide a number!");
    }

    @GetMapping(value = "/doubling", headers = "Accept=application/json")
    public Object doubling(@RequestParam(value="input", required = false) Integer received) {
        if (!(received==null)) {
            return new Doubler(received);
        } else {
            return new ErrorMessage("Please provide an input!");
        }
    }

    @GetMapping("/greeter")
    public Object greeter (@RequestParam(value="name", required = false, defaultValue = "") String name,
                            @RequestParam(value="title", required = false, defaultValue = "") String title) {
        if (name.equals("")) {
            return new ErrorMessage("Please provide a name!");
        } else if (title.equals("")) {
            return new ErrorMessage("Please provide a title!");
        } else {
            return new Greeter(name, title);
        }
    }

    @GetMapping("/appenda/{appendable}")
    public Appenda appenda(@PathVariable String appendable) {
        return new Appenda(appendable);
    }

    @PostMapping("/dountil/{what}")
    public DoUntilResponse doUntil(
            @PathVariable String what, @RequestBody DoUntilRequest until) {
        return new DoUntilResponse(what, until);
    }

    @Autowired
    LogRepo logRepo;

    @PostMapping("/arrays")
    public Object arrayHandler(@RequestBody ArrayRequest arrayHandler) {

        if (arrayHandler.getWhat().equals("sum")|| arrayHandler.getWhat().equals("multiply")) {
            ArrayResponseInt intResponse = new ArrayResponseInt(arrayHandler.getWhat(), arrayHandler.getNumbers());
            logRepo.save(new Log( "/arrays", intResponse.toString()));
            return intResponse;
        } else if (arrayHandler.getWhat().equals("double")) {
            ArrayResponseArr arrResponse = new ArrayResponseArr(arrayHandler.getNumbers());
            logRepo.save(new Log( "/arrays", arrResponse.toString()));
            return arrResponse;
        } else {
            return new ErrorMessage("Please provie input!");
        }



    }

    @GetMapping("/log")
    public Iterable<Log> log() {
        return logRepo.findAll();
    }
}