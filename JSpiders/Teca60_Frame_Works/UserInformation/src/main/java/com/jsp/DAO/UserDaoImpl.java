package com.jsp.DAO;

import javax.net.ssl.ManagerFactoryParameters;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.metamodel.ManagedType;

import com.jsp.entity.UserInformation;


public class UserDaoImpl implements UserDao {

	@Override
	public void insertUserInformationObject() {
		
		//Establish the connection
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("UserInformation");
		EntityManager manager=managerFactory.createEntityManager();
				
		//For Transaction
		EntityTransaction transaction= manager.getTransaction();
		
		//To Begin
		transaction.begin();
		UserInformation userInformation=new UserInformation();
		userInformation.setFirstname("Alice");
		userInformation.setLastname("Doe");
		userInformation.setMailid("alice@gmail.com");
		userInformation.setGender("Male");
		userInformation.setPassword("1234");
		userInformation.setMobilenumber(9865321470l);
	
		//Operation
		
		//To Perform Insertion
		manager.persist(userInformation);
		System.out.println("Data Inserted");
		
		//To Commit
		transaction.commit();
		
		//Close the platform/connection
		managerFactory.close();
		
		
		/*
		 * SELECT JPA
		 * CONFIGURE DATABASE CONNECTION
		 * BUILD TOOL (MAVEN)
		 * ADD MAVEN DEPENDENCY,SQL DEPENDENCY
		 * 
		 * 
		 * */
		
		
	}
}