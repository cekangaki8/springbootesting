package com.porestech.learning.springbootesting.service;

import com.porestech.learning.springbootesting.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee getEmployeeByName(String name);

    List<Employee> getAllEmployees();
}
