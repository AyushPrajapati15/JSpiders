package org.jsp.DAO;

import org.jsp.model.Admin;

public interface AdminDao {
	
	public Admin adminLogin(String email_id,String password);

}
