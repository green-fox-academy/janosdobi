package com.greenfox.restproject.controllers;

import com.greenfox.restproject.model.ArrayHandler;
import com.greenfox.restproject.model.ResultArray;
import com.greenfox.restproject.model.ReturnArray;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {

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
        return responseEntity;
    }
}