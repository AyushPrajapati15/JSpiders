package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Product {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/teca61?user=root&password=12345";
		String update="update product set prod_price=prod_price-(prod_price*0.05) where prod_brand='Apple'";
//		String select="select * from product";
//		String select="select * from product where prod_price>200";
//		String select="select * from product where prod_quantity<20";
		String select="select * from product where prod_brand='Nike'";
		
		//TABLE CREATE QUERY
		/*String insertQuery="CREATE TABLE `product` (\r\n"
				+ "  `prod_id` INT NOT NULL,\r\n"
				+ "  `prod_name` VARCHAR(45) NOT NULL,\r\n"
				+ "  `prod_quantity` INT NOT NULL,\r\n"
				+ "  `prod_brand` VARCHAR(45) NOT NULL,\r\n"
				+ "  `prod_price` INT NOT NULL,\r\n"
				+ "  PRIMARY KEY (`prod_id`));";*/
		
		//INSERT COLUMN QUERY
		/*String insertQuery="insert into product VALUES (101,'iPhone',100,'Apple',55000)";
		String insertQuery1="insert into product VALUES (102,'shirts',80,'levis',2500)";
		String insertQuery2="insert into product VALUES (103,'jeans',150,'wrangler',3500)";*/
		try {
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Connection established");
			
			Statement statement=connection.createStatement();
			System.out.println("Platform created");
			int res=statement.executeUpdate(update);
			System.out.println(res);
			
//			int res=statement.executeUpdate(insertQuery);
//			int res1=statement.executeUpdate(insertQuery1);
//			int res2=statement.executeUpdate(insertQuery2);
//			System.out.println((res+res1+res2)+"Row affected");
			ResultSet resultSet=statement.executeQuery(select);
			if(resultSet.isBeforeFirst())
			{
				while(resultSet.next())
				{
					System.out.println("Product id :"+resultSet.getInt("prod_id"));
					System.out.println("Product name :"+resultSet.getString("prod_name"));
					System.out.println("Product quantity :"+resultSet.getInt("prod_quantity"));
					System.out.println("Product brand :"+resultSet.getString("prod_brand"));
					System.out.println("Product price :"+resultSet.getInt("prod_price"));
					System.out.println("------------------------");
				}
			}
			else {
				System.out.println("no product found");
			}
			
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}

}
