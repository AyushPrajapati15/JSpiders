package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.DAO.UserDao;
import com.jsp.DAO.UserDaoImpl;
import com.jsp.model.UserInformation;

@WebServlet("/updateuser")
public class UpdateUserDetails extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userid = request.getParameter("userid").trim();
		int id = Integer.parseInt(userid);
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String emailid = request.getParameter("mailid");
		String mobilenumber = request.getParameter("mb");
		long phonenumber = Long.parseLong(mobilenumber);
		String qualification = request.getParameter("qualifiation");
		String temppercentage = request.getParameter("percentage");
		double percentage = Double.parseDouble(temppercentage);

		// System.out.println(fname);
		// System.out.println(lname);
		// System.out.println(emailid);
		// System.out.println(phonenumber);
		// System.out.println(qualification);
		// System.out.println(percentage);

		UserDao userDao = new UserDaoImpl();
		UserInformation information = new UserInformation();
		information.setFirst_Name(fname);
		information.setLast_Name(lname);
		information.setEmail_Id(emailid);
		information.setMobile_Number(phonenumber);
		information.setQualification(qualification);
		information.setPercentage(percentage);
		information.setId(id);

		int res = userDao.updateUsers(information);
		if (res != 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("AllUserDetails.jsp");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateUserDetails.jsp");
			dispatcher.include(request, response);

		}

	}

}
