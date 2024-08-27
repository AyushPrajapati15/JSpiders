package com.jsp.Service;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

import com.jsp.DAO.BankDAO;
import com.jsp.DAO.BankDAOImpl;
import com.jsp.DAO.UserDao;
import com.jsp.Model.Statement;
import com.jsp.Model.UserAccountDetails;

import javafx.scene.chart.PieChart.Data;

public class BankServiceImpl implements BankService {
	Scanner scanner = new Scanner(System.in);
	BankDAO bankDao = new BankDAOImpl();

	@Override
	public UserAccountDetails bankAccountDetails(int userId) {
		UserAccountDetails userAccountDetails = new UserAccountDetails();
//		if(!bankDao.selectUserDetailsByUsingUserId(userId))
//		{
//			return null;
//		}
		System.out.println("Enter account type");
		System.out.println("Enter 1. For Savings Account \n 2. For Current Account");

		switch (scanner.nextInt()) {
		case 1:
			userAccountDetails.setAccounttype("Savings Account");

			break;
		case 2:
			userAccountDetails.setAccounttype("Current Account");
			break;

		default:
			System.out.println("Invalid Request");
			break;
		}
		System.out.println("Enter your amount");
		userAccountDetails.setAmount(scanner.nextDouble());
		Random random = new Random();
		int accountnumber = random.nextInt(10000000);
		if (accountnumber >= 1000000) {
			accountnumber += 1000000;
		}
		userAccountDetails.setAccountnumber(accountnumber);
		userAccountDetails.setBranch("TECA6061");
		userAccountDetails.setIfsccode("TECA0006061");
		userAccountDetails.setUserid(userId);
//		System.out.println(userAccountDetails);

		if (bankDao.insertBankAccountDetails(userAccountDetails) > 0) {
			return userAccountDetails;
		} else {

			return null;
		}

	}

	@Override
	public void forDebit(int userid) {
		System.out.println("Enter your Account Number");
		Long accountnumber = scanner.nextLong();
		UserAccountDetails userAccountDetails = bankDao.selectUserBankDetailsByUsingAccountNumber(accountnumber,
				userid);

		if (userAccountDetails != null) {
			System.out.println("Enter your amount");
			boolean amountstatus = true;
			double databaseamount = userAccountDetails.getAmount();
			double useramount = scanner.nextDouble();

			while (amountstatus) 
			{

				if (useramount > 0) 
				{

					if (databaseamount >= useramount) 
					{
						amountstatus = false;
						double balance = databaseamount - useramount;
						int number = bankDao.updateAmountByAccountNumber(userAccountDetails.getAccountnumber(),
								balance);
						if (number != 0) 
						{
							Statement statement = new Statement();
							LocalDate date = LocalDate.now();
							statement.setDateoftransaction(Date.valueOf(date));
							LocalTime time = LocalTime.now();
							statement.setTimeoftransaction(Time.valueOf(time));

							statement.setBalance(balance);
							statement.setBankAccountNumber(userAccountDetails.getAccountnumber());
							statement.setTransactionamount(useramount + "Dr");
							statement.setTransactiontype("Banking");
							statement.setUserid(userid);

							int statementDetails = bankDao.insertStatementDetails(statement);
							if (statementDetails != 0) 
							{
								System.out.println("Amount Debited successfully");
							} 
							else 
							{
								System.out.println("server 404");
							}
						} 
						else 
						{
							System.out.println("server 404");
						}
					} 
					else 
					{
						System.out.println("Insufficient Balance");
					}
				} 
				else 
				{
					System.out.println("Enter the valid Amount");
					useramount = scanner.nextDouble();					
				}
			}
		} 
		else {
			System.out.println("Invalid account number");
		}

	}

}
