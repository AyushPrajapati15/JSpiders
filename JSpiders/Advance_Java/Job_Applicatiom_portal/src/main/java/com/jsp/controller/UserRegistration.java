package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.DAO.UserDao;
import com.jsp.DAO.UserDaoImpl;

@WebServlet("/registration")
public class UserRegistration extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String Password = request.getParameter("password");

		UserDao dao = new UserDaoImpl();
		int result = dao.insertUserDetails(email, Password);

		HttpSession session = request.getSession();
		session.setAttribute("mailid", email);
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		if (result != 0) {
			session.setMaxInactiveInterval(20);
			RequestDispatcher dispatcher = request.getRequestDispatcher("UserDetails.html");
			dispatcher.include(request, response);
			writer.println("<center><h1>Registration Successful</h1><center>");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Registration.html");
			dispatcher.include(request, response);
			writer.println("<center><h1>Server 400</h1><center>");
		}

	}

}
