package com.employeemanagementbe.employeemanagementbe.controller;

public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(String message){
        super(message);
    }
}
