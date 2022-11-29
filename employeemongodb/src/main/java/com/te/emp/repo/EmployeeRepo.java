package com.te.emp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.te.emp.document.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Integer>{

}
