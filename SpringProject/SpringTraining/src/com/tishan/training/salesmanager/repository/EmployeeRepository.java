package com.tishan.training.salesmanager.repository;

import com.tishan.training.salesmanager.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
}
