package com.jsp.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.DAO.CustomerDAO;
import com.jsp.entity.Customer;

@Component
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	Scanner scanner;

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public void CustomerDetails() {
		Customer customer = new Customer();
		System.out.println("Enter you FirstName");
		customer.setFirstname(scanner.next());
		System.out.println("Enter you LastName");
		customer.setLastname(scanner.next());
		System.out.println("Enter you Email");
		String email = scanner.next();
		boolean emailstatus = false;
		List<Customer> allCustomerDetails = customerDAO.getAllCustomerDetails();
		for (Customer customer2 : allCustomerDetails) {
			if (customer2.getEmailid().equalsIgnoreCase(email)) {
				emailstatus = true;
				break;
			}
		}
		if (emailstatus) {
			
			
				
				
		} else {
			boolean es=false;
			while(!es)
			{
				System.out.println("Email Already in use");
				System.out.println("Enter you Email");
				email = scanner.next();
				for (Customer customer2 : allCustomerDetails) {
					if (customer2.getEmailid().equalsIgnoreCase(email)) {
						es = true;
					}
				}
				if(es)
				{
					es=false;
					
				}
				else
				{
					
				}
			}
			customer.setEmailid(email);

			System.out.println("Enter you Mobile");
			long mobile = scanner.nextLong();
			boolean mobileStatus = false;
			for (Customer customer2 : allCustomerDetails) {
				if (customer2.getMobilenumbe() == mobile) {
					mobileStatus = true;
					break;
				}
			}
			if (mobileStatus) {
				System.out.println("Mobile number Already in use");
			} else {

				customer.setMobilenumbe(mobile);

				System.out.println("Enter you Password");
				String password = scanner.next();
				boolean passwordStatus = false;
				for (Customer customer2 : allCustomerDetails) {
					if (customer2.getPassword().equalsIgnoreCase(password)) {
						passwordStatus = true;
						break;
					}
				}
				if (passwordStatus) {
					System.out.println("Password is Already in use");
				} else {
					customer.setPassword(password);
					System.out.println("Enter you Address");
					customer.setAddress(scanner.next());
					System.out.println("Enter you Gender");
					customer.setGender(scanner.next());
//					Customer insertCustomerObject = customerDAO.insertCustomerObject(customer);
					System.out.println(customer);
//					if(insertCustomerObject.getCustomerid()!=0)
//					{
//						System.out.println("Registration Successful id is: "+insertCustomerObject.getCustomerid());
//					}
//					else
//					{
//						System.out.println("Server 404");
//					}
				}
			}

		}
	}
}
//crej            