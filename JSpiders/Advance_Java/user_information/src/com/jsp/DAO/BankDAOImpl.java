package com.jsp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.Model.Statement;
import com.jsp.Model.UserAccountDetails;
import com.mysql.cj.xdevapi.Result;

public class BankDAOImpl implements BankDAO {
	private final static String url = "jdbc:mysql://localhost:3306/teca60?user=root&password=12345";
	private final static String user_account_data_insert = "insert into user_account_details(Account_Number, IFSC_Code, Branch, Account_Type, User_Id, Amount) values (?,?,?,?,?,?)";
	private final static String select = "select * from user_account_details where User_Id=?";
	private final static String select_AccountNumber = "Select * from user_account_details where Account_Number=? and user_id=?";
	private final static String update_AccountNumber = "update user_account_details set Amount=? where Account_Number=?";
	private final static String insert_Statement="insert into statement(dateoftransaction, timeoftransaction, transactiontype, transactionamount, balance, BankAccountNumber, userid) values(?,?,?,?,?,?,?)";
	@Override
	public int insertBankAccountDetails(UserAccountDetails userAccountDetails) {

		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(user_account_data_insert);
			ps.setLong(1, userAccountDetails.getAccountnumber());
			ps.setString(2, userAccountDetails.getIfsccode());
			ps.setString(3, userAccountDetails.getBranch());
			ps.setString(4, userAccountDetails.getAccounttype());
			ps.setInt(5, userAccountDetails.getUserid());
			ps.setDouble(6, userAccountDetails.getAmount());
			return  ps.executeUpdate();		

		} catch (SQLException e) {
			System.out.println(e);	
			return 0;
		}
	}

	@Override
	public boolean selectUserDetailsByUsingUserId(int userId) {

		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(select);
			
			
			ps.setInt(1, userId);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {

				return true;//return resultSet.next();

			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public UserAccountDetails selectUserBankDetailsByUsingAccountNumber(Long accountnumber, int userid) {
		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(select_AccountNumber);
				
			ps.setLong(1, accountnumber);
			ps.setInt(2, userid);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				double databaseamount = resultSet.getDouble("Amount");
				long accountnum = resultSet.getLong("Account_Number");
				UserAccountDetails userAccountDetails = new UserAccountDetails();
				userAccountDetails.setAccountnumber(accountnum);
				userAccountDetails.setAmount(databaseamount);
				return userAccountDetails;
			} else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int updateAmountByAccountNumber(long accountnumber, double amount) {

		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(update_AccountNumber);
			ps.setDouble(1, amount);
			ps.setLong(2, accountnumber);
			return ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int insertStatementDetails(Statement statement) {
		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps=connection.prepareStatement(insert_Statement);
			ps.setDate(1, statement.getDateoftransaction());
			ps.setTime(2, statement.getTimeoftransaction());
			ps.setString(3, statement.getTransactiontype());
			ps.setString(4, statement.getTransactionamount());			
			ps.setDouble(4, statement.getBalance());
			ps.setLong(6, statement.getBankAccountNumber());
			ps.setInt(7, statement.getUserid());
			return ps.executeUpdate();
			

		} catch (SQLException e) {
			System.out.println(e);
			return 0;
		}
	}

}
