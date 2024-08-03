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

import com.jsp.DAO.UserDao;
import com.jsp.DAO.UserDaoImpl;
import com.jsp.model.UserInformation;

@WebServlet("/educationdetails")

public class UserEducation extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String qualification = request.getParameter("qualification");
		String userpercentage = request.getParameter("percentage");
		double percentage = Double.parseDouble(userpercentage);
		PrintWriter writer = response.getWriter();

		System.out.println(qualification);
		System.out.println(percentage);

		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("mailid");

		UserDao dao = new UserDaoImpl();
		UserInformation userInformation = new UserInformation();
		userInformation.setQualification(qualification);
		userInformation.setPercentage(percentage);
		userInformation.setEmail_Id(email);
		response.setContentType("text/html");
		int res = dao.updateUserEducationDetails(userInformation);
		if (res != 0) {
//			RequestDispatcher dispatcher = request.getRequestDispatcher("Otp.html");
//			dispatcher.forward(request, response);
//			writer.println("<center><h1>Details Updated</h1><center>");

			Random random = new Random();
			int otp = random.nextInt(9999);
			while (otp <= 999) {
				otp = random.nextInt(9999);
			}
			HttpSession sessions=request.getSession();
			session.setAttribute("otp", otp);

			writer.println("<center style='font-size:30px'>Your otp is " + otp+"</center>");
			RequestDispatcher dispatchers = request.getRequestDispatcher("Otp.html");
			dispatchers.include(request, response);
			

		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("UserDetails.html");
			dispatcher.include(request, response);
			writer.println("<center><h1>server 404</h1><center>");
		}

	}

}






















