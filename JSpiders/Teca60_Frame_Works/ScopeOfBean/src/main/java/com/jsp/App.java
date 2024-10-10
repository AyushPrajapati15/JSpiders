package com.jsp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.model.Student;

/**
 	Scope is used to control he operation of the beans
 	
 	->if scope value is singleton instantly IOCconainer is going to create only one bean by calling the default constructor
 	->by default scope value is singleton
 	->whenever developer gets the bean from the IO container then it is going to give the single bean multiple times
 	->If You set any value in the object it is going to override the previous value
 	
 	->if the scope value is prototype IOC container is going to give the multiple copies of the bean.
 	-> If the scope value is prototype IOC container will not create any bean whenever developer gets the bean from the
 	 IOC container then it is going to give the clone of the bean
 	-> If you set any value in the object it is going to initialize the value in new object.
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/studentconfig.xml");
       Student s1 = context.getBean(Student.class);
       s1.setId(101);
       s1.setName("Alice");
       s1.setEmailId("alice@gmail.com");
       System.out.println(s1);
       
       Student s2=context.getBean(Student.class);
       s2.setId(102);
       s2.setName("Bob");
       s2.setEmailId("bob@gmail.com");
       System.out.println(s2);
       
       System.out.println(s1.hashCode());
       System.out.println(s2.hashCode());
    }

}
