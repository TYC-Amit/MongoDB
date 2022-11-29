package com.te.emp.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private int id;
	private String empCode;
	private String emailOfficial;
	private double ctc;
	private String reportingManager;
	private String leave;
}
