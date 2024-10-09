package com.jsp.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.entity.Admin;
import com.jsp.repository.AdminRepository;

public class AdminDAOImpl implements AdminDAO {
	
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin getAdminDetailsByUsingEmailAndPassword(String enailid, String password) {
		
			return adminRepository.findByAdminemailidAndAdminpassword(enailid, password);
	}
	

}
