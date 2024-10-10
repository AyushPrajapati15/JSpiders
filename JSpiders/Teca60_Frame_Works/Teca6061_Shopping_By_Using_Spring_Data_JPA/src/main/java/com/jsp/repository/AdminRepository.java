package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	Admin findByAdminemailidAndAdminpassword(String emailid, String Password);
}
