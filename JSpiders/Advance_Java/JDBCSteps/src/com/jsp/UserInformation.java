package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInformation {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/teca61?user=root&password=12345";
		/*String insertQuery1="CREATE TABLE `user_information` (\r\n"
				+ "  `first_name` VARCHAR(45) NOT NULL,\r\n"
				+ "  `last_name` VARCHAR(45) NOT NULL,\r\n"
				+ "  `email-id` VARCHAR(45) NOT NULL,\r\n"
				+ "  `mobile` INT NOT NULL,\r\n"
				+ "  `gender` CHAR NOT NULL,\r\n"
				+ "  `address` VARCHAR(45) NOT NULL,\r\n"
				+ "  PRIMARY KEY (`first_name`));";*/
		String insertQuery="insert into user_information VALUES ('Alice', ' Johnson', 'alice@123', '9876543219', 'M', 'hyderabad')";
		String insertQuery1="insert into user_information VALUES ('Jerry', ' Anderson', 'jerry@123', '9574685645', 'f', 'bangalore')";
		String insertQuery2="insert into user_information VALUES ('Bob', ' Smith', 'bob@123', '94568721365', 'M', 'chennai')";
		String insertQuery3="insert into user_information VALUES ('Scoot', ' doe', 'scoot@123', '94578968574', 'f', 'pune')";
		String select="select * from user_information";
		try {
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Connection established");
			
			Statement statement=connection.createStatement();
			System.out.println("Platform created");
			int res=statement.executeUpdate(insertQuery);
			int res1=statement.executeUpdate(insertQuery1) ;
			int res2=statement.executeUpdate(insertQuery2);
			int res3=statement.executeUpdate(insertQuery3);
			
			if(res!=0&&res1!=0&&res2!=0&&res3!=0)
			{
				System.out.println("4 row affected");
			}
			else if(res!=0&&res1!=0&&res2!=0||res3!=0)
			{
				System.out.println("3 row affected");
			}
			else if(res!=0&&res1!=0||res2!=0||res3!=0)
			{
				System.out.println("2 row affected");
			}
			else if(res!=0||res1!=0||res2!=0||res3!=0)
			{
				System.out.println("1 row affected");
			}
			else {
				System.out.println(res+" row affected");
			}
			
			
			//READ OPERATION
			ResultSet resultSet =statement.executeQuery(select);
			if(resultSet.isBeforeFirst())
			{
				while(resultSet.next())
				{
					System.out.println("User first_name "+resultSet.getString("first_name"));
					System.out.println("User last_name "+resultSet.getString("last_name"));
					System.out.println("User email-id "+resultSet.getString("email-id"));
					System.out.println("User mobile "+resultSet.getLong("mobile"));
					System.out.println("User gender "+resultSet.getString("gender"));
					System.out.println("User address "+resultSet.getString("address"));
					System.out.println("-----------------------");
				}
			}
			else {
				System.out.println("no user information found");
			}
			
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}

}
