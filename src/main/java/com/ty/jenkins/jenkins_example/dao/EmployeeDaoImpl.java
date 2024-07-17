package com.ty.jenkins.jenkins_example.dao;

import com.ty.jenkins.jenkins_example.entity.Employee;
import com.ty.jenkins.jenkins_example.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.NoSuchElementException;
@Repository
@AllArgsConstructor
public class EmployeeDaoImpl implements  EmployeeDao {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(String id) {
        return employeeRepository.findById(id).orElseThrow(()-> new NoSuchElementException("invalid id"));
    }


}
