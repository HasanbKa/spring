package com.kahraman.springboot_project.service.impl;

import com.kahraman.springboot_project.exception.ResourceNotFoundException;
import com.kahraman.springboot_project.model.Employee;
import com.kahraman.springboot_project.repository.EmployeeRepository;
import com.kahraman.springboot_project.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {


    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee;

        if (optional.isPresent()) {
            employee = optional.get();
            return employee;
        } else {
            throw new ResourceNotFoundException("Employee", "Id", id);
        }

    }
}
