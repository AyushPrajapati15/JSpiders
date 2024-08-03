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
import com.jsp.model.UserInformation;

@WebServlet("/userdetails")
public class UserDetails extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstname = request.getParameter("userfirstname");
		String lastname = request.getParameter("userlastname");
		String mobilenumber = request.getParameter("usermobilenumber");
		long mobile = Long.parseLong(mobilenumber);
		String gender = request.getParameter("usergender");

		HttpSession session = request.getSession();
		String emailid = (String) session.getAttribute("mailid");
		UserDao dao = new UserDaoImpl();
		UserInformation information = new UserInformation();
		information.setFirst_Name(firstname);
		information.setLast_Name(lastname);
		information.setMobile_Number(mobile);
		information.setGender(gender);
		information.setEmail_Id(emailid);
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		int res = dao.updateUserDetails(information);
		if (res != 0) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("EducationDetails.html");
			dispatcher.include(request, response);
			writer.println("<center><h1>Updated Successfully</h1><center>");
//			System.out.println("Updated Successfully");
		} else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("UserDetails.html");
			dispatcher.include(request, response);
			writer.println("<center><h1>Server 404</h1><center>");
//			System.out.println("not updated");
		}

	}

}
