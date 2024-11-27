package com.kahraman.springboot_project.controller;

import com.kahraman.springboot_project.model.Employee;
import com.kahraman.springboot_project.service.IEmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    private IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("add")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = this.employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("list")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employeesList = this.employeeService.getAllEmployees();
        return new ResponseEntity<>(employeesList, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = this.employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
