package com.ty.jenkins.jenkins_example.controller;



import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name) {
		return name+", Welcome to Springboot through jenkins!";
	}


}
