package com.greenfox.restproject.controllers;

import com.greenfox.restproject.model.ArrayHandler;
import com.greenfox.restproject.model.ResultArray;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {

    @PostMapping("/arrays")
    public ResultArray arrayHandler(@RequestBody ArrayHandler arrayHandler) {

        ResultArray resultArray = new ResultArray(arrayHandler.getWhat(), arrayHandler.getNumbers());

        return resultArray;
    }
}