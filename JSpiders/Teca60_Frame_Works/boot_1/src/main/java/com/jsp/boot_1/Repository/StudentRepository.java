package com.jsp.boot_1.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.boot_1.DTO.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Optional<Student> findByEmailid(String email);

}
