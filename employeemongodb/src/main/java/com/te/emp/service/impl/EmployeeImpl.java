package com.te.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.emp.document.Employee;
import com.te.emp.repo.EmployeeRepo;
import com.te.emp.service.EmployeeService;

@Service
public class EmployeeImpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.insert(addEmployee(employee));
	}

	@Override
	public List<Employee> getEmployee() {
        return employeeRepo.findAll();
	}

}
