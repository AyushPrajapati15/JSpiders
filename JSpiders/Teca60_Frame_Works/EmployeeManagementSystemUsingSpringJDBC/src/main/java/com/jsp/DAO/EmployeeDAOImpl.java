package com.jsp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.model.Employee;
@Component
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final String insert_employee="insert into employee_details(emp_name, emp_sal, emp_deptNo, emp_mobile) values(?,?,?,?)";

	private static final String update_employee_salary="update employee_details set emp_sal=? where emp_deptNo=?";
	
	private static final String update_deptNo_by_emp_Id="update employee_details set emp_deptNo=? where emp_id=?";
	
	private static final String select_employee="select * from employee_details where emp_id=?";
	private static final String select_all_employee="select * from employee_details";	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void insertEmployeeDetails() {
		
		int result = jdbcTemplate.update(insert_employee, "Rock",65000,17,9865321470l);
		System.out.println(result);
	}


	@Override
	public void updateEmployeeDetailsByDptNo() {
		int result = jdbcTemplate.update(update_employee_salary, 70000,13);
		System.out.println(result);
	}


	@Override
	public void updateDeptNoByEmployeeId() {
		int result = jdbcTemplate.update(update_deptNo_by_emp_Id, 18,106);
		System.out.println(result);
	}


	@Override
	public void selectEmployeeById() {
		Employee employee = jdbcTemplate.queryForObject(select_employee, new RowMapperImpl(),101);
		System.out.println(employee);
	}
	
	
	@Override
	public void selectyAllEmployee() {
		List<Employee> allEmployeeDetails = jdbcTemplate.query(select_all_employee, new RowMapperImpl());
		for (Employee employee : allEmployeeDetails) {
			System.out.println(employee.getEmpId());
			System.out.println(employee.getEmpName());
			System.out.println(employee.getEmpSal());
			System.out.println(employee.getEmpDeptNo());
			System.out.println(employee.getEmpMobileNo());
			System.out.println("***********************************");
		}
	}
}




