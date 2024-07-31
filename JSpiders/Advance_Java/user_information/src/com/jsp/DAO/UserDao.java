package com.jsp.DAO;

import com.jsp.Model.UserInformation;

public interface UserDao {

	int userRegistration(UserInformation userinformation);

	UserInformation selectuserDetailsByUsingEmailOrMobileNumberOrPassword(String emailOrMobile, String password);

	void userPasswordUpdate();

}