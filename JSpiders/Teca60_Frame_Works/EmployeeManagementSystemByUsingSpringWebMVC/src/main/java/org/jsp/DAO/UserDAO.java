package org.jsp.DAO;

import java.util.List;

import org.jsp.model.UserInformation;

public interface UserDAO {
	
int insertUserDetails(UserInformation userInformation);

UserInformation gerUserByEmailidAndPassword(String emailid, String password);

List<UserInformation> getAllUserInformation();

List<UserInformation> gerUserDetailsBasedOnValue(String filtervalue);

int deleteUserByUsingEmailid(String email);
 
}