package com.employeemanagementbe.employeemanagementbe.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeemanagementbe.employeemanagementbe.models.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Integer>{
    
    @Query("SELECT e FROM Employee e WHERE CONCAT(e.firstName,' ', e.surname, ' ', e.email, ' ', e.department, ' ', e.employeeNumber, ' ', e.middleName) LIKE %?1%")
    List<Employee> searchEmployees(String keyword);
}
