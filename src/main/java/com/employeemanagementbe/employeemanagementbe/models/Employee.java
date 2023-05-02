package com.employeemanagementbe.employeemanagementbe.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="employee")//create table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="employeeNumber")
    private int employeeNumber;

    @Column(name ="firstName")
    private String firstName;

    @Column(name ="middleName")
    private String middleName;

    @Column(name ="surname")
    private String surname;

    @Column(name ="email")
    private String email;

    @Column(name ="department")
    private String department;

    public Employee() {
    }


    public Employee(String firstName, String middleName, String surname, int employeeNumber, String email,
            String department) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.employeeNumber = employeeNumber;
        this.email = email;
        this.department = department;
    }

   
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    

   
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    
    
}
