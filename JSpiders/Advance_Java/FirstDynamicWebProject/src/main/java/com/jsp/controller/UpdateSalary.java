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

public class UpdateSalary extends GenericServlet
{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String employeesal=request.getParameter("employeesal");
		double salary=Double.parseDouble(employeesal);
		String employeedeptno=request.getParameter("employeedeptno");
		int deptNo=Integer.parseInt(employeedeptno);
		
		String update="update employee_details set emp_sal=? where emp_deptNo=?";
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			}
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/teca60?user=root&password=12345");
			PreparedStatement ps=connection.prepareStatement(update);
			ps.setDouble(1, salary);
			ps.setInt(2, deptNo);
			
			int res=ps.executeUpdate();
			PrintWriter writer=response.getWriter();
			response.setContentType("text/html");			
			if(res!=0)
			{
				writer.println("<center><h1>Salalry updated Successfully</h1></center>");
			}
			else
			{
				writer.println("<center><h1>Invalid deptNo</h1></center>");
			}
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
				
		
	}

}
