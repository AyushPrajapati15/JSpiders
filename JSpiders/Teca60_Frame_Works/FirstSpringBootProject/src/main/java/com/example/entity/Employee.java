package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	private int employeeid;
	private String employeename;
	private String employeemail;
	private String employeepassword;
	private double employeesal;
	private int employeedeptno;
}
