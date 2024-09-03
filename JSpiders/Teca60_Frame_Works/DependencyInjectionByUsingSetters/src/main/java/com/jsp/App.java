package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.model.Engine;
import com.jsp.model.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/vehicleconfig.xml");
    	Vehicle vehicle = context.getBean(Vehicle.class);
    	System.out.println(vehicle);
    	
//    	Engine engine = context.getBean(Engine.class);
//    	System.out.println(engine);
    	
    	
    }
}
