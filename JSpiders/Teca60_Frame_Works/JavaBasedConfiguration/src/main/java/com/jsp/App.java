package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.config.EmployeeConfig;
import com.jsp.model.Address;
import com.jsp.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
   	public static void main( String[] args )
    {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee = context.getBean("employeeBean",Employee.class);
		System.out.println("Employee Bean :"+employee);
		System.out.println("Prototype :"+context.isPrototype("employeeBean"));
		System.out.println("Singleton :"+context.isSingleton("employeeBean"));
		Address address = context.getBean("addressBean",Address.class);
		System.out.println("Address Bean :"+address);
		System.out.println("Prototype :"+context.isPrototype("addressBean"));
		System.out.println("Singleton :"+context.isSingleton("addressBean"));
		
		
    }
}
