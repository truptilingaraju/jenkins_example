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
@AllArgsConstructor
public class EmployeeController {

    @GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name) {
		return name+", Welcome to Springboot through jenkins!";
	}


}
