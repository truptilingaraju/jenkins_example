package com.ty.jenkins.jenkins_example.repository;


import com.ty.jenkins.jenkins_example.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {

   @Query("{name: ?0}")
    public Employee getByName(String name);

    @Query("{location: ?0, salary: ?1}")
    public Employee getByLocationAndSalary(String location, BigDecimal salary);

    @Query("{salary: {$gt: ?0}}")
    public List<Employee> findEmployeeBySalaryGreaterThan(BigDecimal salary);
}
