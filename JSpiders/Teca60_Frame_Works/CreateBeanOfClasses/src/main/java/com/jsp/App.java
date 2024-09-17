package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.model.Employee;

/*
 To get the beans from the IOC container we make use of the getBean() method it is 
 non-static method present in ApplicationContext interface

it is Overloaded method

getBean(String name)

getBean(String name, class <Bean class name>)

getBean (class <Bean class name>)



If the getBean method argument only the reference variable the return type is Object class from the object class down cast it to Bean Class

 Employee object= (Employee) contextgetBean ("emp");
 ******************************************************************************************************************************************************

If the getBean method argument  is both bean reference variable and bean class name.

It is going to get only specified bean from the IOC container and return that object to Specified Bean class

Employee employee= context.getBean("emp", Employee.class);
**************************************************************************************************************************************************************



If the getBean method argument only the Bean Clans the return type of getBean()is Bean Class

It is possible only if IOC container contains single bean related to that class.
Employee bean= context.getBean(Employee.class);


 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/sample.xml");
        int count=context.getBeanDefinitionCount();
//        System.out.println(count);
//        String[] names=context.getBeanDefinitionNames();
//        
//        for(String string:names)
//        {
//        	System.out.println(string);
//        }
        
        Employee employee=(Employee) context.getBean("emp");
        employee.setId(1024);
        employee.setDeptno(101);
        employee.setSal(60000);
        employee.setName("Alice");
        System.out.println(employee);
        
        Employee employee2=context.getBean("emp", Employee.class);
        employee2.setId(1028);
        employee2.setDeptno(102);
        employee2.setSal(65000);
        employee2.setName("Bob");
        System.out.println(employee2);
        
        Employee employee3=context.getBean(Employee.class);
        employee3.setId(1032);
        employee3.setDeptno(103);
        employee3.setSal(70000);
        employee3.setName("Jack");
        System.out.println(employee3);
    }
}