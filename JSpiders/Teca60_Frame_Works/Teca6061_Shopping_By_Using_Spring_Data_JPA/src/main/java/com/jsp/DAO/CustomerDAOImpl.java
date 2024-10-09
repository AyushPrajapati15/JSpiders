package com.jsp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Customer;
import com.jsp.repository.CustomerRepository;
@Component
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
<<<<<<< HEAD
	CustomerRepository customerRepository;

	@Override
	public Customer insertCustomerObject(Customer customer) {
		 return customerRepository.save(customer);
=======
	CustomerRepository custrep;

	@Override
	public Customer insertCustomerObject(Customer customer) {
		 return custrep.save(customer);
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
		
	}

	@Override
	public List<Customer> getAllCustomerDetails() {
<<<<<<< HEAD
		List<Customer> customerList = customerRepository.findAll();
=======
		List<Customer> customerList = custrep.findAll();
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
		return customerList;
		
	}

<<<<<<< HEAD
	@Override
	public Customer getCustomerDetailsByEmailAndPassword(String email,String password) {
	return	customerRepository.findByEmailidAndPassword(email, password);
		
		
	}

=======
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
}
