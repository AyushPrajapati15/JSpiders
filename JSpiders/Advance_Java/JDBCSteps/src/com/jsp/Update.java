package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		
	String url="jdbc:mysql://localhost:3306/teca60?user=root&password=12345";
	String update="update employee_details set emp_sal=95000 where emp_deptNo=10";
	try {
		Connection connection= DriverManager.getConnection(url);
		
		Statement statement= connection.createStatement();
		int res=statement.executeUpdate(update);
		
		if(res!=0)
		{
			System.out.println("Salary updated");
		}
		else {
			System.out.println("No salary updated");
			
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
