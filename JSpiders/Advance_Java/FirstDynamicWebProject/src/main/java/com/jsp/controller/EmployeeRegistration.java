package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;


import javax.servlet.ServletResponse;

public class EmployeeRegistration extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		String employeename = request.getParameter("employeename");
		String employeesal = request.getParameter("employeesal");
		double salary = Double.parseDouble(employeesal);
		String employeedeptno = request.getParameter("employeedeptno");
		int deptNo = Integer.parseInt(employeedeptno);
		String employeemobileno = request.getParameter("employeemobileno");
		long mobileNo = Long.parseLong(employeemobileno);

		String insert = "insert into employee_details(emp_name, emp_sal, emp_deptNo, emp_mobile) values(?,?,?,?)";

		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			}
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/teca60?user=root&password=12345");
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setString(1, employeename);
			ps.setDouble(2, salary);
			ps.setInt(3, deptNo);
			ps.setLong(4, mobileNo);
			int res=ps.executeUpdate();
			PrintWriter writer=response.getWriter(); //USED TO PRINT THE MESSAGE TO THE WEB PAGE BY USING writer.println STATEMENT 
			response.setContentType("text/html");// USED TO CONVERT/FORMAT THE MESSAGE IN THE PRINTLN STATEMENT TO HTML FONT
			if(res!=0)
			{				
				writer.println("<center><h1>Employee Registration Successful...</h1></center>");
			}
			else
			{
				writer.println("<center><h1>Invalid reques</h1></center>t");				
			}
		} catch (SQLException e) {

			System.out.println(e);
		}

	}
}