package com.jsp;

import com.jsp.DAO.UserDao;
import com.jsp.DAO.UserDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	UserDao userDao=new UserDaoImpl();
    	
    	userDao.insertUserInformationObject();
    	
    }
}
