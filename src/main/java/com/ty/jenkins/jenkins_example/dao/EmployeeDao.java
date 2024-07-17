package com.ty.jenkins.jenkins_example.dao;

import com.ty.jenkins.jenkins_example.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {

    public Employee saveEmployee(Employee employee);

    public Employee getEmployee(String id);


}
