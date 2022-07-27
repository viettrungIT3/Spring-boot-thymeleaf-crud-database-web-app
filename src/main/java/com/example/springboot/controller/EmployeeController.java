package com.example.springboot.controller;

import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // display list employees
    @GetMapping()
    public String viewHomePage(Model model) {
        model.addAttribute("listE", employeeService.getAllEmployees());
        return "index";
    }
}
