package com.te.emp.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("employee")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private String empCode;
	private String emailOfficial;
	private double ctc;
	private String reportingManager;
	private String leave;
}
