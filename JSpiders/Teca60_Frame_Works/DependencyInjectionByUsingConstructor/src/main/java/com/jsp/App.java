package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.model.Address;
import com.jsp.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/employee.xml");
    	Employee employee = context.getBean("employee",Employee.class);
    	System.out.println(employee);
    	
//    	Address address = context.getBean("address1",Address.class);
//    	System.out.println(address);
    }
}
