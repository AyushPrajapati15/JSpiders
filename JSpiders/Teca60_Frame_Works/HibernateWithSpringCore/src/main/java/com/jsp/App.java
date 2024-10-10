package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.config.BankCustomerConfig;
import com.jsp.dao.BankCustomerDAO;
import com.jsp.dao.BankCustomerDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)	
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(BankCustomerConfig.class);
    	BankCustomerDAO bankCustomerDAO = context.getBean(BankCustomerDAO.class);
//    	bankCustomerDAO.insertBankCustomerDetails();
    	bankCustomerDAO.selectBankCustomerDetailsByUsingId();
    }
}