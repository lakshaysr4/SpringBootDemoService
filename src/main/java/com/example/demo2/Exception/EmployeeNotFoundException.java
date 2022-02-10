package com.example.demo2.Exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
