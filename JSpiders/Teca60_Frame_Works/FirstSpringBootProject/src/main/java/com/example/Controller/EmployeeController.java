package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.DAO.EmployeeDAO;
import com.example.entity.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDAO employeeDAO;

	@RequestMapping("/employeeregistrationpage")
	public String employeeEegistrationPage() {

		return "EmployeeRegistration";
	}

	@RequestMapping("/employeeregistration")
	public String employeeRegistration(Employee employee) {
		Employee employeedetails = employeeDAO.insertEmployeeDetails(employee);
		if (employeedetails != null) {
			
			return "EmployeeLogin";
		}

		return "redirect:/employeeregistrationpage";
	}

	@RequestMapping("employeeloginpage")
	public String employeeLoginPage() {
		return "EmployeeLogin";
	}

	@RequestMapping("/employeelogin")
	@ResponseBody
	public String employeeLogin(Employee employee) {
		String email = employee.getEmployeemail();
		String password = employee.getEmployeepassword();
		Employee employeeLoginDetails = employeeDAO.employeeLoginByEmailAndPassword(email, password);
		if (employeeLoginDetails != null) {
			System.out.println(employee.getEmployeeid());
			System.out.println(employee.getEmployeename());
			System.out.println(employee.getEmployeemail());
			System.out.println(employee.getEmployeepassword());
			System.out.println(employee.getEmployeesal());
			System.out.println(employee.getEmployeedeptno());
			return "employee Login successful";
		}
		return "Login failed. Please check your credentials.";
//		return "redirect:/employeeloginpage";
	}
	
	
	
}


