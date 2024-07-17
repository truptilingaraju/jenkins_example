package com.ty.jenkins.jenkins_example.service;


import com.ty.jenkins.jenkins_example.dto.EmployeeDto;
import com.ty.jenkins.jenkins_example.entity.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public interface EmployeeService {


    public ResponseEntity<ApiResponse> createEmployee(EmployeeDto employeeDto);

    public ResponseEntity<ApiResponse> getEmployee(String id);






}
