package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.DAO.StudentDAO;
import com.jsp.config.StudentConfig;

/**

 * Hello world!
 
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
    	StudentDAO studentDAO = context.getBean(StudentDAO.class);
//    	studentDAO.insertStudentDetails();
//    	studentDAO.selectStudentByGenderMale();
//    	studentDAO.selectStudentByEmail();
//    	studentDAO.selectStudentByPercentage();
    	studentDAO.selectStudentNameById();
    }
}
