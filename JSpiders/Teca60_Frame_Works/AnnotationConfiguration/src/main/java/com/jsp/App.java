package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.model.Dinga;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/instagramconfig.xml");
    	Dinga dinga = context.getBean(Dinga.class);
    	dinga.chat();
    }
}
