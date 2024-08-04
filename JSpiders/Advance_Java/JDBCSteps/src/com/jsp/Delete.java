package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		
	String url="jdbc:mysql://localhost:3306/teca60?user=root&password=12345";
	String delete="delete from employee_details where emp_id=102";
	try {
		Connection connection= DriverManager.getConnection(url);
		
		Statement statement= connection.createStatement();
		int res=statement.executeUpdate(delete);
		
		if(res!=0)
		{
			System.out.println(res+" row affected");
		}
		else {
			System.out.println(res+" row affected");
			
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
