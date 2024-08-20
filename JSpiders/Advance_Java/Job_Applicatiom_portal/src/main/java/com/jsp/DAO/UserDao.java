package com.jsp.DAO;

import java.util.List;

import com.jsp.controller.GetUserDetailsById;
import com.jsp.model.UserInformation;

public interface UserDao {
	int insertUserDetails(String email,String password);
	int updateUserDetails(UserInformation userInformation);
	int updateUserEducationDetails(UserInformation userInformation);
	int deleteFromUserDetails();
	List<UserInformation> selectAllUserDetails();
	UserInformation GetUserDetailsById(int id);
	int updateUsers(UserInformation information);

}
