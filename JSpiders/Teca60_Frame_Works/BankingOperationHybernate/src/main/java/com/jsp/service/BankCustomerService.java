package com.jsp.service;

import com.jsp.entity.BankCustomer;

public interface BankCustomerService {
	boolean bankCustomerDetails();

	BankCustomer customerLogin();

	void debit();

	void credit();

}
