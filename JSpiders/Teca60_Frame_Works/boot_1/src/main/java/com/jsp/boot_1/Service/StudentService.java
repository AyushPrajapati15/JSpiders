package com.jsp.boot_1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.boot_1.DAO.StudentDAO;
import com.jsp.boot_1.DTO.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	public Student save(Student s) {
		return studentDAO.saveStudent(s);
	}

	public Student update(Student s) {
		return studentDAO.updateStudent(s);
	}
	
	public Student delete(int id) {
		return studentDAO.fetchStudentById(id);
	}
	
	public List<Student> fetchAll() {
		return studentDAO.fetchAllStudent();
	}
	
	public Student fetchByEmail(String emailid) {
		return studentDAO.fetchStudentByEmail(emailid);
	}
	
	
	

}
