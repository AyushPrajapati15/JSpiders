package org.jsp.DAO;

public interface EmployeeDao {
	void insertEmployeeObject();
	void selectEmployeeDetailsById(int id);
	void updateSalaryById(int id,int salary);
	void deleteEmployeeDetailsByUsingId(int id);
	void updateDeptNoByUsingId(int deptno,int id);
	void deleteUserByUsingMobileNo(long mobileno);
	void selectEmployeeDetailsByUsingId(int id);
	void selectEmployeeDetailsBasedOnGender(String gender);
	
}
