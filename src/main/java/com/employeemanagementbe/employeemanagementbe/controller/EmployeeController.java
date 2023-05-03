package com.employeemanagementbe.employeemanagementbe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping(value = "/employee") //this is a url request
public class EmployeeController {
    
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping //working
    public List<Employee>getEmployees(){
        return employeeRepo.findAll();
    }
    @GetMapping(value = "/{employeeNumber}") //working
    public Optional<Employee>findOne (Employee employee){
        return employeeRepo.findById(employee.getEmployeeNumber());
    }

    @PostMapping(value = "/employees") //working
    public Employee save(@Validated @NonNull @RequestBody Employee employee)
    {
        return employeeRepo.save(employee);
    }
    @PutMapping(value = "/{employeeNumber}") //working
    public ResponseEntity<Employee> update( @PathVariable int employeeNumber ,@Validated @NonNull @RequestBody Employee employee)
    {
        Employee updateEmployee = employeeRepo.findById(employeeNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id: " + employeeNumber));

        updateEmployee.setFirstName(employee.getFirstName());
        updateEmployee.setSurname(employee.getSurname());
        updateEmployee.setMiddleName(employee.getMiddleName());
        updateEmployee.setEmail(employee.getEmail());
        updateEmployee.setDepartment(employee.getDepartment());

        employeeRepo.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);

    }
    @DeleteMapping(value = "/{employeeNumber}") //working
    public void delete (@PathVariable int employeeNumber)
    {
        employeeRepo.deleteById(employeeNumber);
    }
    
   


}
