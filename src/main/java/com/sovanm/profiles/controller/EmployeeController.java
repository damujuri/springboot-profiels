package com.sovanm.profiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Value("${employee.name}")
    private String employeeName;

    @GetMapping(value = "/employee")
    public String hello() {
        return "Employee name = " + employeeName;
    }

}
