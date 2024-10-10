package org.jsp.DAO;

import java.util.List;

import org.jsp.model.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class UserDAOIml implements UserDAO {

	@Autowired
	@Qualifier("jdbctemplate")
	JdbcTemplate jdbcTemplate;
<<<<<<< HEAD

	private final static String insert = "insert into user_information(first_name, last_name, email_id, mobile, gender, address, password) "
			+ "values(?,?,?,?,?,?,?)";

	@Override
	public int insertUserDetails(UserInformation userInformation) {
		return jdbcTemplate.update(insert, userInformation.getFirstname(), userInformation.getLastname(),
				userInformation.getEmailid(), userInformation.getMobilenumber(), userInformation.getGender(),
				userInformation.getAddress(), userInformation.getPassword());

=======
	
	private final static String insert=
			"insert into user_information(first_name, last_name, email_id, mobile, gender, address, password) "
					+ "values(?,?,?,?,?,?,?)";

	@Override
	public int insertUserDetails(UserInformation userInformation) {
		return jdbcTemplate.update(insert, userInformation.getFirstname(),userInformation.getLastname(),userInformation.getEmailid(),userInformation.getMobilenumber(),userInformation.getGender(),userInformation.getAddress(),userInformation.getPassword());
		
		
		
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
	}

	@Override
	public UserInformation gerUserByEmailidAndPassword(String emailid, String password) {
<<<<<<< HEAD
		String select = "select * from user_information where email_id=? and password=?";
//		RowMapper<UserInformation> map=(mapRow,rowNum)->{ UserInformation information = new UserInformation();
//		information.setFirstname(mapRow.getString("first_name"));
//		information.setLastname("last_Name");
//		information.setEmailid("email_id");
//		return information;
//		
//		};
		RowMapper<UserInformation> map = (mapRow, rowNum) -> {
			UserInformation information = new UserInformation();
			information.setFirstname(mapRow.getString("first_name"));
			information.setLastname(mapRow.getString("last_name"));
			information.setEmailid(mapRow.getString("email_id"));
			information.setPassword(mapRow.getString("password"));
			information.setMobilenumber(mapRow.getLong("mobile"));
			information.setGender(mapRow.getString("gender"));
			information.setAddress(mapRow.getString("address"));
			return information;
		};

		try {
			UserInformation userInformation = jdbcTemplate.queryForObject(select, map, emailid, password);
=======
		String select ="select * from user_information where email_id=? and password=?";
		RowMapper<UserInformation> map=(mapRow,rowNum)->{ UserInformation information = new UserInformation();
		information.setFirstname(mapRow.getString("first_name"));
		information.setLastname("last_Name");
		information.setEmailid("email_id");
		return information;
		
		};
		try {
			UserInformation userInformation=jdbcTemplate.queryForObject(select, map,emailid,password);
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
			return userInformation;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<UserInformation> getAllUserInformation() {
<<<<<<< HEAD
		String select = "select * from user_information";
		RowMapper<UserInformation> map = (mapRow, rowNum) -> {
			UserInformation information = new UserInformation();
			information.setFirstname(mapRow.getString("first_name"));
			information.setLastname(mapRow.getString("last_name"));
			information.setEmailid(mapRow.getString("email_id"));
			information.setMobilenumber(mapRow.getLong("mobile"));
			information.setGender(mapRow.getString("gender"));
			information.setAddress(mapRow.getString("address"));
			return information;
		};
		try {
			List<UserInformation> listOfUserInformation = jdbcTemplate.query(select, map);
			return listOfUserInformation;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	@Override
	public List<UserInformation> gerUserDetailsBasedOnValue(String filtervalue) {
		String select = "select * from user_information where first_name=? or last_name=? or email_id=? or gender=? or address=? ";
		RowMapper<UserInformation> map = (mapRow, rowNum) -> {
			UserInformation information = new UserInformation();
			information.setFirstname(mapRow.getString("first_name"));
			information.setLastname(mapRow.getString("last_name"));
			information.setEmailid(mapRow.getString("email_id"));
			information.setMobilenumber(mapRow.getLong("mobile"));
			information.setGender(mapRow.getString("gender"));
			information.setAddress(mapRow.getString("address"));
			return information;
		};
		try {
			List<UserInformation> listOfUserInformation = jdbcTemplate.query(select, map,filtervalue,filtervalue,filtervalue,filtervalue,filtervalue);
			return listOfUserInformation;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	@Override
	public int deleteUserByUsingEmailid(String email)
	{
		String delete = "delete from user_information where email_id=?";
		return jdbcTemplate.update(delete, email);
		
	}

}
=======
		String select="select * from user_information";
		RowMapper<UserInformation> map=(mapRow,rowNum)->{
			UserInformation information =new UserInformation();
			information.setFirstname(mapRow.getString("first_name"));
			information.setLastname(mapRow.getString("last_name"));
			information.setEmailid(mapRow.getString("email_id"));
			information.setGender(mapRow.getString("mobile"));
			information.setAddress(mapRow.getString("gender"));
			information.setAddress(mapRow.getString("address"));
			return information;
		};
			List<UserInformation> listOfUserInformation=jdbcTemplate.query(select, map);
			return listOfUserInformation;
		}
		
		
	}
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
