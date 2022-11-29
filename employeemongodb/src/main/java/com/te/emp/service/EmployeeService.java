package com.te.emp.service;

import java.util.List;

import com.te.emp.document.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public List<Employee> getEmployee();
}
