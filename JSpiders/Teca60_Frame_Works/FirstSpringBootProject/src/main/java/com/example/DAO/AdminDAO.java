package com.example.DAO;

import com.example.entity.Admin;

public interface AdminDAO {

	Admin insertAdminDetails(Admin admin);

	Admin adminLoginByEmailidAndPassword(String email, String password);

}
