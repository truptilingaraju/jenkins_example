package com.ty.jenkins.jenkins_example.service.EmployeeServiceImpl;


import com.ty.jenkins.jenkins_example.dao.EmployeeDao;
import com.ty.jenkins.jenkins_example.dto.EmployeeDto;
import com.ty.jenkins.jenkins_example.entity.ApiResponse;
import com.ty.jenkins.jenkins_example.entity.Employee;
import com.ty.jenkins.jenkins_example.responseStructureMethod.ApiResponseMethod;
import com.ty.jenkins.jenkins_example.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImplementation implements EmployeeService {

    private final EmployeeDao employeeDao;
    private final ModelMapper modelMapper;



    public ResponseEntity<ApiResponse> createEmployee(EmployeeDto employeeDto) {

            Employee employee = modelMapper.map(employeeDto, Employee.class);
            Employee employee1 = employeeDao.saveEmployee(employee);

            return ApiResponseMethod.createObject(employee1);

    }


    public ResponseEntity<ApiResponse> getEmployee(String id) {

        return ApiResponseMethod.getObject(employeeDao.getEmployee(id));
    }



}

