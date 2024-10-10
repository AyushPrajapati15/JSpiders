package com.jsp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	@Qualifier("emp")
	private Connection connection;
	private static final String insert = "insert into employee_details(emp_name, emp_sal, emp_deptNo, emp_mobile) values(?,?,?,?)";
	private static final String select = "select * from employee_details where emp_id=?";
<<<<<<< HEAD
	@Override
	public void insertEmployeeDetails() {
		try {
			
=======

	@Override
	public void insertEmployeeDetails() {
		try {

>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setString(1, "Jerry");
			ps.setDouble(2, 65000);
			ps.setInt(3, 16);
			ps.setLong(4, 8569746333l);
			int res = ps.executeUpdate();
			if (res != 0) {
				System.out.println("Data inserted");
			} else {
				System.out.println("Invalid Data");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectEmployeeDetailsByUsingEmployeeId(int id) {
		try {
<<<<<<< HEAD
			
=======

>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
			PreparedStatement ps = connection.prepareStatement(select);
			ps.setInt(1, id);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				System.out.println(resultSet.getString("emp_name"));
				System.out.println(resultSet.getInt("emp_sal"));
				System.out.println(resultSet.getInt("emp_deptNo"));
				System.out.println(resultSet.getLong("emp_mobile"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
