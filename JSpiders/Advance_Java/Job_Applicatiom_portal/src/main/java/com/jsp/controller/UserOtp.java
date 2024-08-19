package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/otp")
public class UserOtp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		int otp = (int) session.getAttribute("otp");
		String usersOtp = request.getParameter("otp");
		int userotp = Integer.parseInt(usersOtp);

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		if (otp == userotp) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Otp.html");
			dispatcher.include(request, response);
			writer.println("<center><h1>Registration Successful</h1><center>");

		} else {
			Random random = new Random();
			otp = random.nextInt(9999);
			session.setAttribute("otp", otp);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Otp.html");
			dispatcher.include(request, response);

			writer.println("<center><h1>Server 404</h1><center>");
		}

	}

}
