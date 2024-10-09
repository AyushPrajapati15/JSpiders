package com.jsp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Customer;
import com.jsp.repository.CustomerRepository;
@Component
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	CustomerRepository custrep;

	@Override
	public Customer insertCustomerObject(Customer customer) {
		 return custrep.save(customer);
		
	}

	@Override
	public List<Customer> getAllCustomerDetails() {
		List<Customer> customerList = custrep.findAll();
		return customerList;
		
	}

}
