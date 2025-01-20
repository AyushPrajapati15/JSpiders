package org.jsp.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@RequestMapping("/customerregistrationpage")
	public String userRegistrationPage() {
//		System.out.println("method called");
		return "CustomerRegistrationPage";
	}
	
	
	@RequestMapping("/userdetails")
	public void getUserDetails(UserInformation userInformation,@RequestParam("date") String date) {
		
		LocalDate parsedDate = LocalDate.parse(date); 
		userInformation.setDateofbirth(parsedDate);  
		System.out.println(userInformation);
	}

}