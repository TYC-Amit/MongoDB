package com.te.emp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.emp.document.Employee;
import com.te.emp.repo.EmployeeRepo;
import com.te.emp.response.EmployeeResponse;
import com.te.emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	EmployeeRepo employeeRepo;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<EmployeeResponse> addEmployee(@RequestBody Employee employee){
		Employee addEmployee = employeeService.addEmployee(employee);
		return new ResponseEntity<>(new EmployeeResponse(false,"Employee Added Succesfully", addEmployee),HttpStatus.OK);
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmployee() {
		 List<Employee> employee = employeeService.getEmployee();
		 return employee;	
	}
}
