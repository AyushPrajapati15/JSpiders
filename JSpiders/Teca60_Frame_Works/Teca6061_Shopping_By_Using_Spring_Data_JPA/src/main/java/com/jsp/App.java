package com.jsp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.DAO.CustomerDAO;
import com.jsp.config.TecaConfig;
import com.jsp.entity.Customer;import com.jsp.service.CustomerService;


public class App 
{
<<<<<<< HEAD
    public static void main( String[] args)
=======
    public static void main( String[] args )
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
    {
    	Scanner scanner =new Scanner(System.in);
    	ApplicationContext context= new AnnotationConfigApplicationContext(TecaConfig.class);
    	CustomerDAO customerDAO = context.getBean(CustomerDAO.class);
    	CustomerService customerService = context.getBean(CustomerService.class);
<<<<<<< HEAD
   
=======
    	
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
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
<<<<<<< HEAD
				customerService.customerLogin();
=======
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
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









