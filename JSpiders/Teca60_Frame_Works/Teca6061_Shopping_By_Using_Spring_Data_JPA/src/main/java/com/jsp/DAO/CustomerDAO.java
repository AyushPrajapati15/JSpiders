package com.jsp.DAO;

import java.util.List;

import com.jsp.entity.Customer;

public interface CustomerDAO {
	Customer insertCustomerObject(Customer customer);
	List<Customer> getAllCustomerDetails();
<<<<<<< HEAD
	Customer getCustomerDetailsByEmailAndPassword(String email,String password);
=======
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
}
