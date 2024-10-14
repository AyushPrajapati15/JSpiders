package com.jsp.boot_1.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.boot_1.DTO.Student;
import com.jsp.boot_1.Repository.StudentRepository;

@Repository
public class StudentDAO {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student saveStudent(Student s)
	{
		return studentRepository.save(s);
	}
	
	public Student updateStudent(Student s)
	{
		Optional<Student> optional = studentRepository.findById(s.getId());
		if(optional.isPresent()) {
			Student db=optional.get();
			if(s.getName()==null) {
				s.setName(db.getName());
			}
			if(s.getEmailid()==null) {
				s.setEmailid(db.getEmailid());
			}
			if(s.getPassword()==null) {
				s.setPassword(db.getPassword());
			}
			if(s.getMobileno()==0) {
				s.setMobileno(db.getMobileno());
			}
			if(s.getAge()==0) {
				s.setAge(db.getAge());
			}
			if(s.getAddress()==null) {
				s.setAddress(db.getAddress());
			}
			return studentRepository.save(s);
		}
		return null;
	}

	public Student fetchStudentById(int id) {
		
		Optional<Student> op = studentRepository.findById(id);
		if(op.isPresent()) {
			Student s=op.get();
			studentRepository.delete(s);
			return s;
		}
		return null;
		
	}
	
	public List<Student> fetchAllStudent()
	{
		List<Student> list = studentRepository.findAll();
		if (!list.isEmpty()) {
			return list;
		}
		return null;
	}
	
	public Student fetchStudentByEmail(String email)
	{
		Optional<Student> op=studentRepository.findByEmailid(email);
		if (op.isPresent()) {
			Student s=op.get();
			return s;
		}
		return null;
	}

}
