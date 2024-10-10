package com.example.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Repository.AdminRepository;
import com.example.entity.Admin;

@Component
public class AdminDAOImpl implements AdminDAO {
		
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin insertAdminDetails(Admin admin) {
		return adminRepository.save(admin);
	}
	
	@Override
	public Admin adminLoginByEmailidAndPassword(String email,String password) {
		return adminRepository.findByAdminmailAndAdminpassword(email, password);

	}
}
