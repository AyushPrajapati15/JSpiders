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
import org.springframework.web.bind.annotation.ResponseBody;

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
			
			return "redirect:/alldetails";
			
		}
		else
		{
			model.addAttribute("error", "Invalid email or password");
			return "redirect:/adminloginpage";
		}
		
		
		
	}
	
	@RequestMapping("/filter")
	public String filter(String filtervalue,Model model)
	{
		List<UserInformation> userInformations=userDAO.gerUserDetailsBasedOnValue(filtervalue);
		model.addAttribute("alluserdetails",userInformations);		
		return "AllUserDetails";
	}
	 
	
	@RequestMapping("/update")
	public void update() {

	}
	
	@RequestMapping("/delete")
//	@ResponseBody
	public String delete(@RequestParam("email") String email) {
//		System.out.println(email);
		int res = userDAO.deleteUserByUsingEmailid(email);
		if(res!=0)
		{
			return "redirect:/alldetails";
		}
		else {
			return null;
			
		}
	}
	
	
	@RequestMapping("/alldetails")
	public String allUserDetails(Model model) {
		List<UserInformation> allUserInformation=userDAO.getAllUserInformation();
		model.addAttribute("alluserdetails",allUserInformation);	
		return "AllUserDetails";

	}
	
	


}