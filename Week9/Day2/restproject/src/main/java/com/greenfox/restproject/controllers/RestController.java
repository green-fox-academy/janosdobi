package com.greenfox.restproject.controllers;


import com.greenfox.restproject.model.*;
import com.greenfox.restproject.repositories.LogRepo;
import com.greenfox.restproject.service.LogList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    LogRepo logRepo;

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
        Appenda appenda = new Appenda(appendable);
        logRepo.save(new Log("/appenda", appenda.toString()));
        return appenda;
    }

    @PostMapping("/dountil/{what}")
    public DoUntilResponse doUntil(
            @PathVariable String what, @RequestBody DoUntilRequest until) {
        DoUntilResponse doUntilResponse = new DoUntilResponse(what, until);
        logRepo.save(new Log("/dountil", doUntilResponse.toString()));
        return doUntilResponse;
    }

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
            return new ErrorMessage("Please provide input!");
        }
    }

    @GetMapping("/log")
    public LogList log() {
        LogList entries = new LogList();
        for(Log l : logRepo.findAll()) {
            entries.addEntry(l);
        }
        entries.setEntryCount(entries.getEntries().size());
        return entries;
    }
}