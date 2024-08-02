package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeSelection extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		String select = "select * from employee_details";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/teca60?user=root&password=12345");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(select);

				response.setContentType("text/html");
				PrintWriter writer = response.getWriter();
				if (resultSet.isBeforeFirst()) {
					writer.println("<center><table border='2px' style='cellpadding:5px; '><tr><th>EmployeeName</th><th>EmployeeSalary</th><th>EmployeeDeptNo</th></tr>");
					while (resultSet.next()) {						
						writer.println("<tr><td>"+resultSet.getString("emp_name")+"</td><td>"+resultSet.getDouble("emp_sal")+"</td><td>"+resultSet.getInt("emp_deptNo")+"</td></tr>");
					}
					writer.println("</table></center>");
				}
				else {
					writer.println("<center><h1>No records present</center></h1>");
				}

			} catch (SQLException e) {
				System.out.println(e);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("Employee details are.....");

	}

}
