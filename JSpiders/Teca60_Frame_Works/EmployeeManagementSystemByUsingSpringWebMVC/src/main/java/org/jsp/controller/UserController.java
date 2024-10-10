package org.jsp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

<<<<<<< HEAD
import org.jsp.DAO.UserDAO;
import org.jsp.model.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
=======
import org.jsp.model.UserInformation;
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
<<<<<<< HEAD
	@Autowired	
	UserDAO userDAO;
	
	
	
	@RequestMapping("/userregistration")
	public String userRegistration() {
		return "UserRegistration";
=======
	@RequestMapping("/userregistration")
	public String userRegistration() {
		return "UserRegistration";

>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
	}
	
	
//	@RequestMapping("/userdetails")
//	@ResponseBody
//	public String userDetails(@RequestParam("firstname") String userfirstname,
//			@RequestParam("lastname") String userlastname,
//		 	@RequestParam("emailid") String useremailid,
//			@RequestParam("password") String userpassword,
//			@RequestParam("mobilenumber") long usermobilenumber,
//			@RequestParam("gender") String usergender,
//			@RequestParam("address") String useraddress) {
//		
//		return "User registration successful";
//
//	}
	
	@RequestMapping("/userdetails")
<<<<<<< HEAD
=======
//	@ResponseBody
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
	public String userDetails(UserInformation userInformation,HttpServletRequest request) {
		
		HttpSession session=request.getSession();
		session.setAttribute("mail", userInformation.getEmailid());
		session.setAttribute("password",userInformation.getPassword());
<<<<<<< HEAD
//		System.out.println(userInformation);
		int result = userDAO.insertUserDetails(userInformation);
		if (result!=0) {
			return "UserLogin";
		} else {
			return "redirect:/UserRegistration";
		}	
	}
	
	@RequestMapping("/userloginpage")
	public String userLogin() {
		return "UserLogin";
		
		
		}
=======
		System.out.println(userInformation);
		if (userInformation!=null) {
			return "UserLogin";
		} else {
			return "UserRegistration";
		}

	}
	
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
	
	@RequestMapping("/userlogin")
	@ResponseBody
	public String userLogin(String emailid,String password,HttpServletRequest request) {
<<<<<<< HEAD
//		HttpSession session= request.getSession();
//		String useremailid=(String)session.getAttribute("mailid");
//		String userpassword=(String)session.getAttribute("password");
		UserInformation userInformation = userDAO.gerUserByEmailidAndPassword(emailid, password);
		if (userInformation!=null) {
			
			return "<center><h1>Welcome : "+userInformation.getFirstname()+"</h1></center>";
		} else {
			return "redirect:/userloginpage";
=======
		HttpSession session= request.getSession();
		String useremailid=(String)session.getAttribute("mailid");
		String userepassword=(String)session.getAttribute("password");
		if (emailid.equals(useremailid)&&password.equals(userepassword)) {
			
			return "Login Successful";
		} else {
			return "UserLogin";

>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
		}

	}

}
