package com.jsp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO {

	@Autowired
	@Qualifier("user")
	private Connection connection;
	private static final String insert = "insert into users_information(First_Name, Last_Name, Email_Id, Mobile_No, Gender, Address, Password) "
			+ "values(?,?,?,?,?,?,?)";

	@Override
	public void insertUserDetails() {

		try {
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setString(1, "Tom");
			ps.setString(2, "Doe");
			ps.setString(3, "tom@gmail.com");
			ps.setLong(4, 9632587410l);
			ps.setString(5, "Male");
			ps.setString(6, "Hyderabad");
			ps.setString(7, "4563");
			int res = ps.executeUpdate();
			if (res != 0) {
				System.out.println("Data inserted");
			} else {
				System.out.println("Invalid data");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
