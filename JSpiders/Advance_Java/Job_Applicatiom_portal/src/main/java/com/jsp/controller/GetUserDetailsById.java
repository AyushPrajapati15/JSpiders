package com.jsp.controller;

import java.io.IOException;

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

@WebServlet("/selectuserdetails")

public class GetUserDetailsById extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String tempId = request.getParameter("userid");
		int userId = Integer.parseInt(tempId);

		UserDao userDao = new UserDaoImpl();

		UserInformation userInformation = userDao.GetUserDetailsById(userId);
		// System.out.println(userInformation);
		HttpSession session = request.getSession();

		session.setAttribute("userbyid", userInformation);
		RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateUserDetails.jsp");
		dispatcher.forward(request, response);

	}

}
