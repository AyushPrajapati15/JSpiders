package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.DAO.EmployeeDAO;
import com.example.entity.Employee;


@Component
public class CommonPropertiesImpl implements CommonProperties {
	
	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public List<Employee> allEmployeeDetails() {


		return employeeDAO.allEmployeeDetails();
		

	}

}
