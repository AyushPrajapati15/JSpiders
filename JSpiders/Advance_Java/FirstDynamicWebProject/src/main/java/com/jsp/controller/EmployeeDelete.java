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

public class EmployeeDelete extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String employeeId = request.getParameter("employeeid");
		int id = Integer.parseInt(employeeId);

		String delete = "delete from employee_details where emp_id=?";

		try {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			}

			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/teca60?user=root&password=12345");
			PreparedStatement ps = connection.prepareStatement(delete);
			ps.setInt(1, id);

			int res=ps.executeUpdate();
			PrintWriter writer=response.getWriter();
			response.setContentType("text/html");
			if(res!=0)
			{
				writer.println("<center><h1>Employee deleted successfully...</h1></center>");
			}
			else
			{
				writer.println("<center><h1>Invalid empId</h1></center>");
			}
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		System.out.println("Employee deleted");

	}

}
