package com.employeemanagementbe.employeemanagementbe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagementbe.employeemanagementbe.models.Employee;
import com.employeemanagementbe.employeemanagementbe.repo.EmployeeRepo;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping
    public List<Employee>getEmployees(){
        return employeeRepo.findAll();
    }
    @GetMapping(value = "/{employeeNumber}")
    public Optional<Employee>findOne (Employee employee){
        return employeeRepo.findById(employee.getEmployeeNumber());
    }

    @PostMapping
    public Employee save(@Validated @NonNull @RequestBody Employee employee)
    {
        return employeeRepo.save(employee);
    }
    @PutMapping("/{employeeNumber}")
    public Employee update(@Validated @NonNull @RequestBody Employee employee)
    {
        return employeeRepo.save(employee);

    }
    @DeleteMapping(value = "/{employeeNumber}")
    public void delete (@PathVariable int employeeNumber)
    {
        employeeRepo.deleteById(employeeNumber);
    }
    
   


}
