package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.model.Customer;
import com.jsp.model.TajBanjara;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/file/tajbanjaraconfig.xml");
        // TajBanjara tajBanjara = context.getBean(TajBanjara.class);
        // System.out.println(tajBanjara.menu());
        Customer customer = context.getBean(Customer.class);
        customer.display();

    }
}
