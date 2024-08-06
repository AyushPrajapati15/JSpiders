package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import com.jsp.DAO.AdminDao;
import com.jsp.DAO.AdminDaoImpl;
import com.jsp.DAO.UserDao;
import com.jsp.DAO.UserDaoImpl;
import com.jsp.model.UserInformation;

@WebServlet("/adminlogin")
//@WebServlet("/AllUserDetails.jsp")
public class AdminLogin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminDao adminDao = new AdminDaoImpl();
		UserDao userDao=new UserDaoImpl();

		String email = request.getParameter("emailid");
		String password = request.getParameter("password");

//		System.out.println(email);
//		System.out.println(password);
		HttpSession session = request.getSession();
		
		String name=adminDao.adminLogin(email, password);
		session.setAttribute("name", name);
		if (adminDao.adminLogin(email, password) != null) {
//			System.out.println("To be continued");
			List<UserInformation> information= userDao.selectAllUserDetails();
			session.setAttribute("userInformation", information);
//			System.out.println(information);
			RequestDispatcher dispatcher=request.getRequestDispatcher("AllUserDetails.jsp");
			dispatcher.forward(request, response);
			
			

		} else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("Admin.jsp");
			dispatcher.forward(request, response);
			System.out.println("Invalid details ");

		}
	}
}
