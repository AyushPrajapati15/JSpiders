package com.example.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Repository.EmployeeRepository;
import com.example.entity.Employee;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee insertEmployeeDetails(Employee employee) {
		return employeeRepository.save(employee);
		
		
	}
	
	@Override
	public Employee employeeLoginByEmailAndPassword(String email,String password) {
		return employeeRepository.findByEmployeemailAndEmployeepassword(email, password);
		
	}
	
	@Override
	public List<Employee> allEmployeeDetails() {
		return employeeRepository.findAll();

	}
	


}
