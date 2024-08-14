package com.jsp.DAO;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.entity.BankCustomer;

public class BankCustomerDaoImpl implements BankCustomerDao {

	@Override
	public long insertBankCustomerObject(BankCustomer bankCustomer) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("BankingOperationHybernate");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(bankCustomer);
		transaction.commit();
		return bankCustomer.getAccountNumber();
		
	}
	@Override
	public BankCustomer selectBankCustomerDetailsByUsingEmailIdAndPassword(String emailid,int password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BankingOperationHybernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createNamedQuery("selectcustomerbyemailidandassword");
		query.setParameter(1,emailid);
		query.setParameter(2, password);
		BankCustomer bankCustomer = (BankCustomer) query.getSingleResult();
		return bankCustomer;
	}
	@Override
	public int updateCustomerAmount(int accountNumber, double balance) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BankingOperationHybernate");
		EntityManager manager = managerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("updatecustomeramount");
		query.setParameter(1, balance);
		query.setParameter(2, accountNumber);
		int result = query.executeUpdate();
		transaction.commit();
		return result;
		
		
		
		
		
		
	}
}
