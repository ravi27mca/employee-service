package com.example.employee.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Value("${app.message}")
    private String message;

    @Value("${app.version}")
    private String version;

    @Value("${app.author}")
    private String author;

    @Value("${employee.department}")
    private String department;

    @Value("${employee.location}")
    private String location;

    @GetMapping("/employee")
    public String getEmployeeConfig() {

        return "Message: " + message
                + ", Version: " + version
                + ", Author: " + author
                + ", Department: " + department
                + ", Location: " + location;
    }
}