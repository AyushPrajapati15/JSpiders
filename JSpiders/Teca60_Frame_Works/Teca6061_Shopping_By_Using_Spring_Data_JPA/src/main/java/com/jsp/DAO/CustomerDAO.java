package com.jsp.DAO;

import java.util.List;

import com.jsp.entity.Customer;

public interface CustomerDAO {
	Customer insertCustomerObject(Customer customer);
	List<Customer> getAllCustomerDetails();
	Customer getCustomerDetailsByEmailAndPassword(String email,String password);
}
