package com.example.DAO;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeDAO {
	Employee insertEmployeeDetails(Employee employee);

	Employee employeeLoginByEmailAndPassword(String email, String password);

	List<Employee> allEmployeeDetails();
	
}
