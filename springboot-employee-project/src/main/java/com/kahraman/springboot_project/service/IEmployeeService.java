package com.kahraman.springboot_project.service;

import com.kahraman.springboot_project.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
}
