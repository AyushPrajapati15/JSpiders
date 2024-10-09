package com.jsp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.DAO.CustomerDAO;
import com.jsp.config.TecaConfig;
import com.jsp.entity.Customer;import com.jsp.service.CustomerService;


public class App 
{
    public static void main( String[] args)
    {
    	Scanner scanner =new Scanner(System.in);
    	ApplicationContext context= new AnnotationConfigApplicationContext(TecaConfig.class);
    	CustomerDAO customerDAO = context.getBean(CustomerDAO.class);
    	CustomerService customerService = context.getBean(CustomerService.class);
   
    	boolean status=true;
    	while (status) 
    	{
    		System.out.println("Enter \n 1 Admin login \n 2 Customer login \n 3 Customer registration");
    		
    		
    		
    		int key= scanner.nextInt();
    		switch (key) {
			case 1:
				System.out.println("Admin login");
				break;
			case 2:
				System.out.println("Customer login");
				customerService.customerLogin();
				break;
			case 3:
				customerService.CustomerDetails();
				break;

			default:
				System.out.println("Enter valid input");
				break;
			}
			
		}
    	
    }
}









