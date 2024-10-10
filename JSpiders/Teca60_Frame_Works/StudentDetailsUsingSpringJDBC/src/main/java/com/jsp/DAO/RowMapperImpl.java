package com.jsp.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jsp.model.Student;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();	
		student.setStd_id(rs.getInt("std_id"));
		student.setStd_name(rs.getString("std_name"));
		student.setMarks(rs.getInt("marks"));
		student.setStd_gender(rs.getString("std_gender"));
		student.setStd_email(rs.getString("std_email"));
		student.setStd_password(rs.getString("std_password"));
		student.setStd_percent(rs.getInt("std_percent"));
		student.setStd_stream(rs.getString("std_stream"));
		return student;
	}

}
