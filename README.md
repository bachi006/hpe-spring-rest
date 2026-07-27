# Spring Boot Employee REST API

A lightweight RESTful web service built with Spring Boot for managing employee records. This project demonstrates core Spring Web MVC concepts, including controllers, request mapping, and handling JSON data using an in-memory data structure.

## Tech Stack
* **Java:** 21
* **Framework:** Spring Boot 3.4.0
* **Build Tool:** Maven

## Features
* Retrieve a list of all employees.
* Add a new employee to the directory.
* Simple in-memory data management.

## Prerequisites
* Java Development Kit (JDK) 21 installed.
* Maven installed (or use the provided Maven wrapper `mvnw`).

## Getting Started

### 1. Build the Project
To build the project and resolve all dependencies, run:
```bash
./mvnw clean install
```
*(On Windows, use `mvnw.cmd clean install`)*

### 2. Run the Application
You can start the Spring Boot application using the Maven wrapper:
```bash
./mvnw spring-boot:run
```
The application will start locally on `http://localhost:8080`.

## API Endpoints

### 1. Home
* **URL:** `/`
* **Method:** `GET`
* **Response:** Returns a welcome message.

### 2. Get All Employees
* **URL:** `/employees`
* **Method:** `GET`
* **Response:** Returns a JSON object containing a list of employees.

**Example Response:**
```json
{
  "employeeList": [
    {
      "employee_id": "001",
      "first_name": "John",
      "last_name": "Doe",
      "email": "john.doe@example.com",
      "title": "Developer"
    }
  ]
}
```

### 3. Add a New Employee
* **URL:** `/employees`
* **Method:** `POST`
* **Headers:** `Content-Type: application/json`
* **Body:**
```json
{
  "employee_id": "004",
  "first_name": "Jane",
  "last_name": "Smith",
  "email": "jane.smith@example.com",
  "title": "Manager"
}
```
* **Response:** Returns the updated list of all employees including the newly added one.

## Running Tests
To execute the unit tests for the controllers and application context, run:
```bash
./m
```
