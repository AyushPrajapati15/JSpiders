package com.jsp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.Model.UserAccountDetails;
import com.jsp.Model.UserInformation;
import com.mysql.cj.protocol.Resultset;

public class UserDAOimpl implements UserDao {
	private final static String url = "jdbc:mysql://localhost:3306/teca60?user=root&password=12345";
	private final static String user_data_insert = "insert into users_information(First_Name, Last_Name, Email_Id, Mobile_No, Gender, Address, Password) values (?,?,?,?,?,?,?)";
	private final static String user_Login = "select * from users_information where (Email_Id=? or Mobile_No=?) and Password=?";

	public int userRegistration(UserInformation userinformation) {
		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(user_data_insert);

			ps.setString(1, userinformation.getFirstname());
			ps.setString(2, userinformation.getLastname());
			ps.setString(3, userinformation.getEmailid());
			ps.setLong(4, userinformation.getMobileno());
			ps.setString(5, userinformation.getGender());
			ps.setString(6, userinformation.getAddress());
			ps.setString(7, userinformation.getPassword());	

			int res = ps.executeUpdate();
			return res;

		} catch (SQLException e) {
			System.out.println(e);
			return 0;
		}

	}

	@Override
	public UserInformation selectuserDetailsByUsingEmailOrMobileNumberOrPassword(String emailOrMobile,
			String password) {
		try {
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(user_Login);
			ps.setString(1, emailOrMobile);
			ps.setString(2, emailOrMobile);
			ps.setString(3, password);
			ResultSet resultSet = ps.executeQuery();

			if (resultSet.next()) {
				String firstname = resultSet.getString("First_Name");
				String gender = resultSet.getString("Gender");
				long mobileNumber = resultSet.getLong("Mobile_No");
				int userId = resultSet.getInt("user_id");
				UserInformation inUserInformation = new UserInformation();
				inUserInformation.setFirstname(firstname);
				inUserInformation.setGender(gender);
				inUserInformation.setMobileno(mobileNumber);
				inUserInformation.setId(userId);
				return inUserInformation;
			} else {
				return null;
			}

		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}

	}

	@Override
	public void userPasswordUpdate() {

	}

}
