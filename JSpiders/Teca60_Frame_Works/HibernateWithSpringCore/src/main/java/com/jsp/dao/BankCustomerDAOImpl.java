package com.jsp.dao;

import java.time.LocalDate;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Bankcustomer;

@Component
public class BankCustomerDAOImpl implements BankCustomerDAO {
	
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	
	@PostConstruct
	public void toBegin() {
		transaction.begin();
	}

	@Override
	public void insertBankCustomerDetails() {
		 if (manager == null) {
		        System.out.println("EntityManager is null");
		    }
		Bankcustomer bankcustomer=new Bankcustomer();
		bankcustomer.setUserfirstname("Jack");
		bankcustomer.setUserlastname("Doe");
		bankcustomer.setEmailid("jack@gmail.com");
		bankcustomer.setGender("Male");
		bankcustomer.setAccountnumber(9856327);
		bankcustomer.setDateofbirth(LocalDate.of(2024, 8, 21));
		bankcustomer.setAmount(55000);
		bankcustomer.setMobileno(9876543210l);
		bankcustomer.setPassword(4312);
		
		manager.persist(bankcustomer);
		
		transaction.commit();
		System.out.println("Data inserted");
		manager.close();
	}

	@Override
	public void selectBankCustomerDetailsByUsingId() {
		
		Bankcustomer  bankcustomer=manager.find(Bankcustomer.class,1);
		System.out.println(bankcustomer);
			
		
	}

}





























