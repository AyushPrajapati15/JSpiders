package com.jsp.DAO;

import com.jsp.entity.Admin;

public interface AdminDAO {
	
	Admin getAdminDetailsByUsingEmailAndPassword(String enailid, String password);

}
