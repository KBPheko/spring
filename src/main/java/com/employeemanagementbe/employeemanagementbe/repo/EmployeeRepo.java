package com.employeemanagementbe.employeemanagementbe.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagementbe.employeemanagementbe.models.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee,Integer>{
    
}
