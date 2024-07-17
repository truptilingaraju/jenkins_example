package com.ty.jenkins.jenkins_example.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.List;

@Document(value="Employee")
@Data
public class Employee {

    @Id
    private String id;
    @Field(name="emp_name")
    private  String name;
    private String location;
    private BigDecimal salary;

}
