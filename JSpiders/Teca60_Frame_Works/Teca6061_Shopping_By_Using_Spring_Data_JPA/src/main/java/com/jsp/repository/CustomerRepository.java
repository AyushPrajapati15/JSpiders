package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	

}
