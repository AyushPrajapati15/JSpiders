package com.jsp.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jsp.model.Student;

@Component
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String insert_student_details=
"insert into student_details(std_name, marks, std_gender, std_email, std_password, std_percent, std_stream) values(?,?,?,?,?,?,?)";
	private static final String select_Student_By_Gender="select * from student_details where std_gender=?";
	private static final String select_student_By_Email="select * from student_details where std_email=?";
	private static final String select_student_by_percentage="select * from student_details where std_percent<=?";
	private static final String select_studentName_by_Id="select std_name from student_details where std_id=?";

	@Override
	public void insertStudentDetails() {
		int result = jdbcTemplate.update(insert_student_details, "Bob",77,"M","bob@gmail.com","bob123",25,"cs");
		System.out.println(result);
		
	}

	@Override
	public void selectStudentByGenderMale() {
		List<Student> list = jdbcTemplate.query(select_Student_By_Gender, new RowMapperImpl(),"M");
		for (Student student : list) {
			System.out.println(student.getStd_id());
			System.out.println(student.getStd_name());
			System.out.println(student.getMarks());
			System.out.println(student.getStd_gender());
			System.out.println(student.getStd_email());
			System.out.println(student.getStd_password());
			System.out.println(student.getStd_percent());
			System.out.println(student.getStd_stream());
			System.out.println("***********************************************");
			
		}
		

	}

	@Override
	public void selectStudentByEmail() {
		Student student = jdbcTemplate.queryForObject(select_student_By_Email, new RowMapperImpl(),"alice@gmail.com");
		System.out.println(student);


	}

	@Override
	public void selectStudentByPercentage() {
		List<Student> list = jdbcTemplate.query(select_student_by_percentage, new RowMapperImpl(),35);
		for (Student student : list) {
			System.out.println(student.getStd_id());
			System.out.println(student.getStd_name());
			System.out.println(student.getMarks());
			System.out.println(student.getStd_gender());
			System.out.println(student.getStd_email());
			System.out.println(student.getStd_password());
			System.out.println(student.getStd_percent());
			System.out.println(student.getStd_stream());
			System.out.println("***********************************************");
			
		}


	}

	@Override
	public void selectStudentNameById() {
		BeanPropertyRowMapper<Student> impl= new BeanPropertyRowMapper<Student>(Student.class);
		Student student = jdbcTemplate.queryForObject(select_studentName_by_Id,impl,101);
		System.out.println(student);
	}

}





















