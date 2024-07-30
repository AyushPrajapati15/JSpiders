package com.jsp.Service;

import java.util.Scanner;

import com.jsp.DAO.UserDAOimpl;
import com.jsp.DAO.UserDao;
import com.jsp.Model.UserInformation;

public class UserServiceImpl implements UserService {

	Scanner scanner=new Scanner(System.in);
	UserInformation userinformation=new UserInformation();
	UserDao userDao =new UserDAOimpl();
	@Override
	public int userData() {
		
		System.out.println("Enter your First Name");
		userinformation.setFirstname(scanner.next());
		System.out.println("Enter your Last Name");
		userinformation.setLastname(scanner.next());
		System.out.println("Enter your Email id");
		userinformation.setEmailid(scanner.next());
		System.out.println("Enter your Mobile Number");
		userinformation.setMobileno(scanner.nextLong());
		System.out.println("Enter your Gender");
		userinformation.setGender(scanner.next());
		System.out.println("Enter your Address");
		userinformation.setAddress(scanner.next());
		System.out.println("Enter your Password");
		userinformation.setPassword(scanner.next());
		
		int res =userDao.userRegistration(userinformation);
		return res;
	}
	@Override
	public UserInformation userLogin() {
		System.out.println("Enter Email_id or Mobile number");
		String emailOrMobile=scanner.next();
		System.out.println("Enter the Password");
		String password=scanner.next();
		
		UserInformation userInformation= userDao.selectuserDetailsByUsingEmailOrMobileNumberOrPassword(emailOrMobile,password);
		return userInformation;
	}
	

}
