package com.jsp.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;

import com.jsp.model.Address;
import com.jsp.model.Employee;

@Configuration
public class EmployeeConfig {
	@Bean
	@Scope("prototype")
	public Employee employeeBean()
	{
		Employee employee=new Employee(1024,"Alice",55000,101);
		return employee;
		
	}
	@Bean
	public Address addressBean() {
		Address address=new Address();
		address.setPin(769004);
		address.setCity("Rourkela");
		address.setState("Odisha");
		return address;
		

	}
	@Bean
	public Date dateBean()
	{
		Date date=new Date();
		return date;
	}

}
