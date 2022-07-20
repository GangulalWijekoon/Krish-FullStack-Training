package com.tishan.training.salesmanager.config;

import com.tishan.training.salesmanager.repository.EmployeeRepository;
import com.tishan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.tishan.training.salesmanager.service.EmployeeService;
import com.tishan.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.tishan")
public class ApplicationConfiguration {
    @Bean(name="employeeService")
    @Scope("singleton")
    public EmployeeService getEmployeeService(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        return new EmployeeServiceImpl();
    }

    /*@Bean(name="employeeService)
    public EmployeeService getEmployeeService(){
        return new employeeServiceImpl();
    }*/

    /*@Bean(name="employeeRepository")
    public EmployeeRepository getEmployeeRepository(){
        return new HibernateEmployeeRepositoryImpl();
    }*/
}