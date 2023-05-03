package com.employeemanagementbe.employeemanagementbe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagementbe.employeemanagementbe.models.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Integer>{
    
}
