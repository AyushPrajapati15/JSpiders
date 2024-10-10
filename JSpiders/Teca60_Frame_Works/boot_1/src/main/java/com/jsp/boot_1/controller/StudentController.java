package com.jsp.boot_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.boot_1.DTO.Student;
import com.jsp.boot_1.Service.StudentService;


//@Controller
//@ResponseBody
@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	//http://localhost:8083/registration
	@PostMapping("/registration")
	public Student studentRegistration(@RequestBody Student s) {
		
		return service.save(s);
	}
	
	@GetMapping("/update")
//	@PostMapping("/update")
	public Student studentUpdate(@RequestBody Student s) {
		return service.update(s);

	}
	
	@DeleteMapping("/delete/{id}")
	public Student deleteStudent(@PathVariable int id) {
		return service.delete(id);
	}

	@GetMapping("/allstudent")
	public List<Student> getAllStudent() {
		return service.fetchAll();
	}
	
	@GetMapping("/studentbyemail")
	public Student getStudentByEmail(@RequestBody String emailid) {
		return service.fetchByEmail(emailid);
	}
	
	
}
