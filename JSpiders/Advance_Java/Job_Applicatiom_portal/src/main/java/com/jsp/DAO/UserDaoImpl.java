package com.jsp.DAO;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import com.jsp.model.UserInformation;
import com.mysql.cj.jdbc.Driver;

public class UserDaoImpl implements UserDao {
	private final static String url = "jdbc:mysql://localhost:3306/teca60?user=root&password=12345";
	private final static String insert_email_password = "insert into user_details(Email_Id,Password) values(?,?)";
	private final static String update_user_details = "update user_details set First_Name=?, Last_Name=?, Mobile_Number=?, Gender=? where Email_Id=?";
	private final static String update_user_education_details = "update user_details set Qualification=?,Percentage=? where Email_Id=?";
	private final static String delete = "delete from teca60.user_detail where Percentage is NUll";
	private final static String select_all_user = "select * from user_details";
	private final static String select_all_user_by_id = "select * from user_details where id=?";
	private final static String update_user = "update user_details set First_Name=?, Last_Name=?, Mobile_Number=?,Email_Id=?,Qualification=?,Percentage=? where id=?";

	@Override
	public int insertUserDetails(String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(insert_email_password);
			ps.setString(1, email);
			ps.setString(2, password);
			return ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println(e);
			return 0;
		} catch (SQLException e) {
			System.out.println(e);
			return 0;
		}
	}

	@Override
	public int updateUserDetails(UserInformation userInformation) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(update_user_details);
			ps.setString(1, userInformation.getFirst_Name());
			ps.setString(2, userInformation.getLast_Name());
			ps.setLong(3, userInformation.getMobile_Number());
			ps.setString(4, userInformation.getGender());
			ps.setString(5, userInformation.getEmail_Id());
			return ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println(e);
			return 0;
		} catch (SQLException e) {
			System.out.println(e);
			return 0;
		}

	}

	@Override
	public int updateUserEducationDetails(UserInformation userInformation) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(update_user_education_details);
			ps.setString(1, userInformation.getQualification());
			ps.setDouble(2, userInformation.getPercentage());
			ps.setString(3, userInformation.getEmail_Id());
			return ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public int deleteFromUserDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(delete);
			return ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public List<UserInformation> selectAllUserDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(select_all_user);
			ResultSet resultSet = ps.executeQuery();
			List<UserInformation> list = new ArrayList<UserInformation>();
			if (resultSet.isBeforeFirst()) {
				while (resultSet.next()) {
					UserInformation userInformation = new UserInformation();
					userInformation.setFirst_Name(resultSet.getString("First_Name"));
					userInformation.setLast_Name(resultSet.getString("Last_Name"));
					userInformation.setMobile_Number(resultSet.getLong("Mobile_Number"));
					userInformation.setEmail_Id(resultSet.getString("Email_Id"));
					userInformation.setPassword(resultSet.getString("Password"));
					userInformation.setQualification(resultSet.getString("Qualification"));
					userInformation.setPercentage(resultSet.getDouble("Percentage"));
					userInformation.setGender(resultSet.getString("Gender"));
					userInformation.setId(resultSet.getInt("id"));
					list.add(userInformation);

				}
				return list;
			} else {
				return null;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public UserInformation GetUserDetailsById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(select_all_user_by_id);
			ps.setInt(1, id);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				UserInformation userInformation = new UserInformation();
				userInformation.setFirst_Name(resultSet.getString("First_Name"));
				userInformation.setLast_Name(resultSet.getString("Last_Name"));
				userInformation.setMobile_Number(resultSet.getLong("Mobile_Number"));
				userInformation.setEmail_Id(resultSet.getString("Email_Id"));
				userInformation.setPassword(resultSet.getString("Password"));
				userInformation.setQualification(resultSet.getString("Qualification"));
				userInformation.setPercentage(resultSet.getDouble("Percentage"));
				userInformation.setGender(resultSet.getString("Gender"));
				userInformation.setId(resultSet.getInt("id"));

				return userInformation;
			} else {
				return null;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public int updateUsers(UserInformation information) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement ps = connection.prepareStatement(update_user);
			ps.setString(1, information.getFirst_Name());
			ps.setString(1, information.getLast_Name());
			ps.setString(1, information.getEmail_Id());
			ps.setLong(1, information.getMobile_Number());
			ps.setString(1, information.getQualification());
			ps.setDouble(1, information.getPercentage());
			ps.setInt(1, information.getId());
			return ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}

	}

}
