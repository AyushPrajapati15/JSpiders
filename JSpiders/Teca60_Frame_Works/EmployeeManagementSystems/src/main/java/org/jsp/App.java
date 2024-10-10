package org.jsp;

import org.jsp.DAO.EmployeeDao;
import org.jsp.DAO.EmployeeDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	EmployeeDao dao=new EmployeeDaoImpl();
//    	dao.insertEmployeeObject();
//    	dao.selectEmployeeDetailsById(1);
//    	dao.updateSalaryById(1,76000);
//    	dao.deleteEmployeeDetailsByUsingId(2);
//    	dao.updateDeptNoByUsingId(10, 2);
//    	dao.deleteUserByUsingMobileNo(9865327412l);
//    	dao.selectEmployeeDetailsByUsingId(1);
    	dao.selectEmployeeDetailsBasedOnGender("female");
    }
}
