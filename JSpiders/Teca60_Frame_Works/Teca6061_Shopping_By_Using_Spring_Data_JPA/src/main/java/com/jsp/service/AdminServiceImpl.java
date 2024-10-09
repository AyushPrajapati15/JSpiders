package com.jsp.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.DAO.AdminDAO;
import com.jsp.entity.Admin;

public class AdminServiceImpl implements AdminService {

	@Autowired
	Scanner scanner;
	@Autowired
	AdminDAO adminDAO;
	@Autowired
	ProductServices productServices;
	
	@Override
	public void adminLogin() {
		System.out.println("Enter your EmailId");
		String emailId=scanner.next();
		System.out.println("Enter your password");
		String password=scanner.next();
		Admin admin=adminDAO.getAdminDetailsByUsingEmailAndPassword(emailId, password);
		if (admin!=null) {
			System.out.println("***---Welcome to "+admin.getAdminrole()+"--**");
			
			System.out.println("Enter \n 1.For Add Products \n 2.For Delete Produts");
			switch (scanner.nextInt())
			{
			case 1:
				System.out.println("Add Produts");
				
				
				break;
			case 2:
				System.out.println("Delete Product");
				break;

			default:
				break;
			}
			
		} 
		else
		{
            System.out.println("Invalid details");
		}
		
	}

}
