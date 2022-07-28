package com.example.springboot.controller;

import com.example.springboot.model.Employee;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/create")
    public String addEmployeeForm(Model model) {
        // create model attribute to bind form data
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "addEmployeeForm";
    }

    @PostMapping("/employees/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // save employee to database
        employeeService.saveEmployee(employee);
        // back page index
        return "redirect:/";
    }

    @GetMapping("/employees/update/{id}")
    public String updateEmployeeForm(@PathVariable(value = "id") Long id, Model model) {

        // get employee from the service
        Employee employee = employeeService.getEmployeeById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("employee", employee);
        return "updateEmployee";
    }

    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Long id) {

        // call delete employee method
        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
}
