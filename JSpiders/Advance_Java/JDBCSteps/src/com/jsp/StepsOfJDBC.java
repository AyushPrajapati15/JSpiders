package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StepsOfJDBC {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
//		String insert="insert into teca60.employee_details values(102,'Bob',85000,11,9785641236)";
//		String create="create database teca61";
//		String table="create table teca61.student_details(std_id int ,std_name varchar(45),marks int)";
		String insert="insert into teca61.student_details values(102,'Bob',85)";
		try {
			Connection connection= DriverManager.getConnection(url);
			System.out.println("Connection Established");
			Statement statement=connection.createStatement();
			System.out.println("Creating the platform");
//			int result=statement.executeUpdate(insert);
//			System.out.println(result+" row affected");
//			statement.executeUpdate(create);
			statement.executeUpdate(insert);
		} catch (SQLException e) {
//			System.out.println("Sql Exception");
			System.err.println(e);
		}
	}

}