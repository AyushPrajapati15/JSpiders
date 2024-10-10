package org.jsp.controller;

import java.util.List;

import org.jsp.DAO.AdminDao;
import org.jsp.DAO.UserDAO;
import org.jsp.model.Admin;
import org.jsp.model.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	@Autowired
	AdminDao adminDao;
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/adminloginpage")
	public String adminLoginPage() {
		
		return "AdminLogin";

	}
	
	@RequestMapping("/adminlogin")
	public String adminlogin(@RequestParam("email") String email_id, 
			@RequestParam("password") String password, Model model) 
	{
		Admin adminlogin =adminDao.adminLogin(email_id, password);
		if (adminlogin!=null) {
			List<UserInformation> allUserInformation=userDAO.getAllUserInformation();
			model.addAttribute("alluserdetails",allUserInformation);
			return "AllUserDetails";
		}
		else
		{
			return "redirect:/adminloginpage";
		}
		
		
		
	}

}
