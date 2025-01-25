package org.jsp.DAO;

import org.jsp.controller.UserInformation;

public class UserDAOImpl implements UserDAO {
	

	@Override
	public void insertUseretails() {
		String insert =	"insert into userinformation(NAME, EMAIL, MOBILENUMBER, PASSWORD, AGE, DATEOFBIRTH, ADDRESS, GENDER, AADHARNUMBER) values(?,?,?,?,?,?,?,?,?)";	
		UserInformation information=new UserInformation();
		
	}

}
