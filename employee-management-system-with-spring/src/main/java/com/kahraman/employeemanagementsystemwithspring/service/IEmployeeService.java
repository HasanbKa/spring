package com.kahraman.employeemanagementsystemwithspring.service;

import com.kahraman.employeemanagementsystemwithspring.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById (Long id);
    void deleteEmployeeById(Long id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
