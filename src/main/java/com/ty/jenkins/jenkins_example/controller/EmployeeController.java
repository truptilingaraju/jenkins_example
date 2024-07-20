package com.ty.jenkins.jenkins_example.controller;


import com.ty.jenkins.jenkins_example.dto.EmployeeDto;
import com.ty.jenkins.jenkins_example.entity.ApiResponse;
import com.ty.jenkins.jenkins_example.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<ApiResponse> createEmployee( @RequestBody EmployeeDto employeeDto){

        return employeeService.createEmployee(employeeDto);
    }



    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getEmployee(@PathVariable String id){

        return employeeService.getEmployee(id);
    }


    @GetMapping("/message")
    public String getMessage(){
        return "Hello World";
    }


}
