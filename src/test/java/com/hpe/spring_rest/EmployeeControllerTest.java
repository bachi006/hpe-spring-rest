package com.hpe.spring_rest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTest {
    private EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        employeeController = new EmployeeController();
    }

    @Test
    void testGetEmployees() {
        Employees employees = employeeController.getEmployees();

        assertNotNull(employees);
        assertNotNull(employees.getEmployeeList());
        assertEquals(3, employees.getEmployeeList().size());
    }

    @Test
    void testAddEmployee() {
        Employee newEmployee = new Employee("004", "Sam", "Ramanujan", "sam@gmail.com", "Professor");

        Employees updatedEmployees = employeeController.addEmployee(newEmployee);

        assertNotNull(updatedEmployees);
        assertEquals(4, updatedEmployees.getEmployeeList().size());

        Employee lastAddedEmployee = (Employee) updatedEmployees.getEmployeeList().get(3);
        assertEquals("004", lastAddedEmployee.getEmployee_id());
        assertEquals("Sam", lastAddedEmployee.getFirst_name());
        assertEquals("Ramanujan", lastAddedEmployee.getLast_name());
        assertEquals("sam@gmail.com", lastAddedEmployee.getEmail());
        assertEquals("Professor", lastAddedEmployee.getTitle());
    }
}