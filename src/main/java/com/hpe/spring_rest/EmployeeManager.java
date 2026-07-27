package com.hpe.spring_rest;

public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        initializeEmployees();
    }

    private void initializeEmployees() {
        employees.addEmployee(new Employee("001", "Vamshi", "Boga", "vamshi@gmail.com", "Developer"));
        employees.addEmployee(new Employee("002", "Raju", "B", "rj@gmail.com", "SWE"));
        employees.addEmployee(new Employee("003", "Uday", "B", "uday@gmail.com", "Manager"));
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}
