package org.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	
	@RequestMapping("/registration")
	@ResponseBody
	public String employeeRegistration() {
//		System.out.println("Employee Registration");
		return "Employee Registration";

	}
	
	@RequestMapping("/deletion")
	public void employeeDeletion() {
		System.out.println("Employee Deletion");

	}
	
	@RequestMapping("/updation")
	public void employeeUpdation() {
		System.out.println("Employee Updation");

	}
	
	@RequestMapping("/selection")
	public void employeeSelection() {
		System.out.println("Employee Selection");

	}
	@RequestMapping("/registrationpage")
	public String employeeRegistrationPage() {
		return "EmployeeRegistration";
		
	}
	
	@ResponseBody
	@RequestMapping("/employeedetails")
	public String employeeDetails(String name,double sal,int deptNo) {
		System.out.println(name);
		System.out.println(sal);
		System.out.println(deptNo);
		return "Employee Registration Successful ---------------> "
				+ "Name is : "+name+", Salary is : "+sal+", Dept-No is : "+deptNo;		

	}

}
