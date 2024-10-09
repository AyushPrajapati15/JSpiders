package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.DAO.AdminDAO;
import com.example.Service.CommonProperties;
import com.example.entity.Admin;
import com.example.entity.Employee;

@Controller
public class AdminController {

	@Autowired
	AdminDAO adminDAO;
	
	@Autowired
	CommonProperties commonProperties;
	
	@RequestMapping("/homepage")
	public String homePage() {
		return "Index";
	}

	@RequestMapping("/adminregistrationpage")
	public String adminRegistrationPage() {

		return "AdminRegistration";

	}

	@RequestMapping("/adminregistration")
	public String adminRegistration(Admin admin) {

		Admin adminDetails = adminDAO.insertAdminDetails(admin);
		if (adminDetails != null) {
			return "AdminLogin";
		}
		return "redirect:/adminregistrationpage";
	}

	@RequestMapping("/adminloginpage")
	private String adminLoginPage() {
		return "AdminLogin";

	}

	@RequestMapping("/adminlogin")
<<<<<<< HEAD
//	@ResponseBody
=======
	@ResponseBody
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
	public String adminLogin(Admin admin, Model model) {
		String emailid = admin.getAdminmail();
		String password = admin.getAdminpassword();
		Admin adminLoginDetails = adminDAO.adminLoginByEmailidAndPassword(emailid, password);
		if (adminLoginDetails != null) {
			List<Employee> allEmployeeDetails = commonProperties.allEmployeeDetails();
<<<<<<< HEAD
			model.addAttribute("allemployeedetails", allEmployeeDetails);
=======
//			model.addAttribute("allemployeedetails", allEmployeeDetails);
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
//			for (Employee employee : allEmployeeDetails) {
//				System.out.println(employee.getEmployeeid());
//				System.out.println(employee.getEmployeename());
//				System.out.println(employee.getEmployeemail());
//				System.out.println(employee.getEmployeepassword());
//				System.out.println(employee.getEmployeesal());
//				System.out.println(employee.getEmployeedeptno());
//				System.out.println("*************************************************************");
//			}			
<<<<<<< HEAD
			return "AllUserDetails";
		}
//		return "Login failed. Please check your credentials.";
		return "redirect:/adminloginpage";
=======
			return "Admin Login Successful";
		}
		return "Login failed. Please check your credentials.";
//		return "redirect:/adminloginpage";
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf

	}
	
	
	
	

}
