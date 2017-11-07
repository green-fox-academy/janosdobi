package com.greenfox.restproject.controllers;

import com.greenfox.restproject.model.ArrayHandler;
import com.greenfox.restproject.model.Log;
import com.greenfox.restproject.model.ResultArray;
import com.greenfox.restproject.model.ReturnArray;
import com.greenfox.restproject.repositories.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {

    @Autowired
    LogRepo logRepo;

    @PostMapping("/arrays")
    public ResponseEntity arrayHandler(@RequestBody ArrayHandler arrayHandler) {

        ResponseEntity responseEntity;

        if (arrayHandler.getWhat().equals("sum")|| arrayHandler.getWhat().equals("multiply")) {
            ResultArray resultArray = new ResultArray(arrayHandler.getWhat(), arrayHandler.getNumbers());
            responseEntity = new ResponseEntity(resultArray, HttpStatus.OK);
        } else {
            ReturnArray returnArray = new ReturnArray(arrayHandler.getNumbers());
            responseEntity = new ResponseEntity(returnArray, HttpStatus.OK);
        }

        logRepo.save(new Log( "/arrays", responseEntity.toString()));

        return responseEntity;
    }

    @GetMapping("/log")
    public Iterable<Log> log() {
        return logRepo.findAll();
    }

}