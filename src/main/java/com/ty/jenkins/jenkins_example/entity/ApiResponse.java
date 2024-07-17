package com.ty.jenkins.jenkins_example.entity;

import lombok.Data;
import org.springframework.http.HttpStatus;


@Data
public class ApiResponse {

     int httpStatusCode;
     HttpStatus httpStatus;
     Object data;
}
