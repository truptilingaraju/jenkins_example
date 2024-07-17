package com.ty.jenkins.jenkins_example.dto;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class EmployeeDto {

    String id;

    private  String name;
    private String location;
    private BigDecimal salary;

}
