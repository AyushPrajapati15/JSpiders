package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/teca61?user=root&password=12345";
//		String insertQuery1="insert into student_details VALUES ('103', ' Jack', '77', 'M', 'jack@gmail.com', 'jack123',75,It)";
//		String update="update student_details set std_password='alice321' where std_email='alice@gmail.com',Mech";
//		String delete="delete from student_details where std_percent=95";
//		String select="select * from student_details";
//		String select="select * from student_details where std_percent=75";
		String select="select * from student_details where std_stream='mech'";
		try {
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Connection established");
			
			Statement statement=connection.createStatement();
			System.out.println("Platform created");
//			int res=statement.executeUpdate(insertQuery1);
//			int res=statement.executeUpdate(delete);
			
//			if(res!=0)
//			{
//				System.out.println(res+" row affected");
//			}
//			else {
//				System.out.println(res+" row affected");
//			}	
			
			
//			WRITE OPERATION
			ResultSet resultSet=statement.executeQuery(select);
			
			if(resultSet.isBeforeFirst())
			{
				while(resultSet.next())
				{
					
					System.out.println("Student id :"+resultSet.getInt("std_id"));
					System.out.println("Student name :"+resultSet.getString("std_name"));
					System.out.println("Student marks :"+resultSet.getInt("marks"));
					System.out.println("Student gender :"+resultSet.getString("std_gender"));
					System.out.println("Student email :"+resultSet.getString("std_email"));
					System.out.println("Student password :"+resultSet.getString("std_password"));
					System.out.println("Student percent :"+resultSet.getInt("std_percent"));
					System.out.println("Student stream :"+resultSet.getString("std_stream"));
					System.out.println("------------------------");
				}
			}
			else
			{
				System.out.println();
				
			}
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}

}
