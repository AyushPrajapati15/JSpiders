package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Admin findByAdminmailAndAdminpassword(String adminmail,String adminpassword);
	
	

}
