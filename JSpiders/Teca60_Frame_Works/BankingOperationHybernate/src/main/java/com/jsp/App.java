package com.jsp;

import java.util.Scanner;

import com.jsp.entity.BankCustomer;
import com.jsp.service.BankCustomerService;
import com.jsp.service.BankCustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println( "Hello World!" );
        BankCustomerService customerService = new BankCustomerServiceImpl();
        boolean bankCustomerDetails = customerService.bankCustomerDetails();
        // BankCustomer customerLogin = customerService.customerLogin();
        // if(customerLogin!=null)
        // {
        // System.out.println("Enter \n 1.For Credit \n 2. For Debit \n 3. To Change
        // password");
        // switch (scanner.nextInt()) {
        // case 1:
        // customerService.credit();
        //
        // break;
        // case 2:
        // customerService.debit();
        // break;
        //
        // default:
        // break;
        // }
        //
        // }
        // else
        // {
        // System.out.println("Invalid data");
        // }
    }
}
