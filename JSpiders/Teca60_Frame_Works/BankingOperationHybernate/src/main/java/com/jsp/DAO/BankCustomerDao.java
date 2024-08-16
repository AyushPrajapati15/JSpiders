package com.jsp.DAO;

import com.jsp.entity.BankCustomer;

public interface BankCustomerDao {
	long insertBankCustomerObject(BankCustomer bankCustomer);
	BankCustomer selectBankCustomerDetailsByUsingEmailIdAndPassword(String emailid, int password);
	int updateCustomerAmount(int accountNUmber,double balance);	
}
