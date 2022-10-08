package com.pnc.MacTesting.controller;

import com.pnc.MacTesting.model.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/hi")
public class MacController {

    @GetMapping("/springResp1")
    public Employee showDetails(){
        return new Employee(10,"vasu",44000);
    }
}

