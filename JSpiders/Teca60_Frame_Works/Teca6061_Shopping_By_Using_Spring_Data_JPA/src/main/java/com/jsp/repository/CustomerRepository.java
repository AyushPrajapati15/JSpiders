package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
<<<<<<< HEAD
		Customer findByEmailidAndPassword(String email,String password);
	

}
	
=======

}
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
