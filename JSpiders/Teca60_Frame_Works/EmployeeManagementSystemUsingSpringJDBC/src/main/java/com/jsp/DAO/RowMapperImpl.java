package com.jsp.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jsp.model.Employee;

public class RowMapperImpl implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

<<<<<<< HEAD
		Employee employee=new Employee();
=======
		Employee employee = new Employee();
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
		employee.setEmpId(rs.getInt("emp_id"));
		employee.setEmpName(rs.getString("emp_name"));
		employee.setEmpSal(rs.getDouble("emp_sal"));
		employee.setEmpDeptNo(rs.getInt("emp_deptNo"));
		employee.setEmpMobileNo(rs.getLong("emp_mobile"));
		return employee;
	}

}
