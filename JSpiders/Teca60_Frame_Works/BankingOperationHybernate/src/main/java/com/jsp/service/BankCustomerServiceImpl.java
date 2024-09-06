package com.jsp.service;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.DAO.BankCustomerDao;
import com.jsp.DAO.BankCustomerDaoImpl;
import com.jsp.entity.BankCustomer;

public class BankCustomerServiceImpl implements BankCustomerService {
	BankCustomer bankCustomer;

	Scanner scanner = new Scanner(System.in);
	BankCustomerDao dao = new BankCustomerDaoImpl();

	@Override
	public boolean bankCustomerDetails() {
		bankCustomer = new BankCustomer();
		System.out.println("Enter your First Name");
		String fName = scanner.next();
		bankCustomer.setUserFirstName(fName);

		System.out.println("Enter your Last Name");
		String lName = scanner.next();
		bankCustomer.setUserLastName(lName);
		// }
		System.out.println("Enter your Email Id");
		bankCustomer.setEmailId(scanner.next());
		//
		System.out.println("Enter your Mobile Number");
		bankCustomer.setMobileNo(scanner.nextLong());

		System.out.println("Enter your  of Birth year");
		int year = scanner.nextInt();
		System.out.println("Enter  Birth month");
		int month = scanner.nextInt();
		System.out.println("Enter Date  of Birth");
		int date = scanner.nextInt();
		LocalDate dateofbirth = LocalDate.of(year, month, date);
		bankCustomer.setDateOfBirth(dateofbirth);

		System.out.println("Enter your Password");
		bankCustomer.setPassword(scanner.nextInt());
		System.out.println("Enter your Gender");
		bankCustomer.setGender(scanner.next());
		System.out.println("Enter your Amount");
		bankCustomer.setAmount(scanner.nextDouble());
		Random random = new Random();
		int accountnumber = random.nextInt(10000000);
		if (accountnumber < 1000000) {
			accountnumber += 1000000;
		}

		bankCustomer.setAccountNumber(accountnumber);
		long CustomerObject = dao.insertBankCustomerObject(bankCustomer);
		if (CustomerObject != 0) {
			return true;
		} else {
			return false;
		}

	}

	private boolean isEmailIdValid(String emailId) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean islNameValid(String lName) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isfNameValid(String fName) {

		return false;
	}

	@Override
	public BankCustomer customerLogin() {

		System.out.println("Enter your Email Id");
		String emailid = scanner.next();
		System.out.println("Enter your Password");
		int password = scanner.nextInt();
		// try {
		bankCustomer = dao.selectBankCustomerDetailsByUsingEmailIdAndPassword(emailid, password);
		return bankCustomer;

		// } catch (Exception e) {

		// return null;
		// }
	}

	@Override
	public void debit() {
		System.out.println("Enter the amount");
		double userAmount = scanner.nextDouble();
		if (userAmount > 0) {
			double databaseAmount = bankCustomer.getAmount();
			if (databaseAmount >= userAmount) {
				double balance = databaseAmount - userAmount;
				dao.updateCustomerAmount(bankCustomer.getAccountNumber(), balance);
				bankCustomer.setAmount(balance);
				System.out.println("Transaction successful");
			} else {
				System.out.println("In-sufficient Amount");
			}
		} else {
			System.out.println("Invalid Amount");
		}

	}

	@Override
	public void credit() {
		System.out.println("Enter the Enter Amount");
		double userAmount = scanner.nextDouble();
		if (userAmount > 0) {
			double databaseAmount = bankCustomer.getAmount();
			double balance = databaseAmount + userAmount;
			dao.updateCustomerAmount(bankCustomer.getAccountNumber(), balance);
			System.out.println("Amount credited successfully");

		} else {
			System.out.println("Invalid Amount");

		}

	}

}
