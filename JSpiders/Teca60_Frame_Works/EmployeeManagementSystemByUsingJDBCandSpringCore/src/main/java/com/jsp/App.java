package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.DAO.EmployeeDAO;
import com.jsp.DAO.UserDAO;
import com.jsp.config.EmployeeConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		UserDAO userDAO = context.getBean(UserDAO.class);
		// employeeDAO.insertEmployeeDetails();
		// employeeDAO.selectEmployeeDetailsByUsingEmployeeId(101);
		userDAO.insertUserDetails();
	}
}
