package com.tishan.training.salesmanager.repository;

import com.tishan.training.salesmanager.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("repository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    //with this we gonna hide real implementation from the model/class
    //implementing method to return all employees as an ArrayList

    @Override
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setEmployeeName("Tishan");
        employee.setEmployeeLocation("Seeduwa");
        employees.add(employee);
        return employees;


    }
}
