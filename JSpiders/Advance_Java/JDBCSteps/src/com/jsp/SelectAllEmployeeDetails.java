package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectAllEmployeeDetails {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/teca60?user=root&password=12345";
		String select="select * from employee_details";
		try {
			Connection connection=DriverManager.getConnection(url);
			System.out.println("connection established");
			Statement statement=connection.createStatement();
			System.out.println("platform created");
			ResultSet resultSet=statement.executeQuery(select);
			System.out.println("connected");
//			if(resultSet.next())
//			{
//				System.out.println("Record Present");
//			}
			int i=1;
			if(resultSet.isBeforeFirst())
			{
			while(resultSet.next())
			{
//				System.out.println("Record Present");
				System.out.println();
				System.out.println("Record "+i+":--");
				System.out.println("Employee Id: " +resultSet.getInt("emp_id"));
				System.out.println("Employee Name : " +resultSet.getString("emp_name"));
				System.out.println("Employee Salary : " +resultSet.getDouble("emp_sal"));
				System.out.println("Employee Dept No : " +resultSet.getInt("emp_deptNo"));
				System.out.println("Employee Mobile : " +resultSet.getLong("emp_mobile"));
				System.out.println("------------------------------");
				System.out.println();
				i++;
				
			}
			}
			else {
				System.out.println("No Record Present");//execute when the record is not created in the buffer memory as per the given sql query condition
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}