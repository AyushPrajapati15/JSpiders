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
<<<<<<< HEAD
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);    
    	 EmployeeDAO employeeDAO= context.getBean(EmployeeDAO.class);
    	 UserDAO userDAO = context.getBean(UserDAO.class);
//    	 employeeDAO.insertEmployeeDetails();
//    	 employeeDAO.selectEmployeeDetailsByUsingEmployeeId(101);
    	 userDAO.insertUserDetails();
    }
=======
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		UserDAO userDAO = context.getBean(UserDAO.class);
		// employeeDAO.insertEmployeeDetails();
		// employeeDAO.selectEmployeeDetailsByUsingEmployeeId(101);
		userDAO.insertUserDetails();
	}
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
}
