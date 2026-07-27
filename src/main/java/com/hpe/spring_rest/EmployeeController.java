package com.hpe.spring_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping("/employees")
    public Employees getEmployees() {
        return employeeManager.getEmployees();
    }

    @PostMapping("/employees")
    public Employees addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
        return employeeManager.getEmployees();
    }
}
