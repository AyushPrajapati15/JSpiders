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
	
	private final static String insert=
			"insert into user_information(first_name, last_name, email_id, mobile, gender, address, password) "
					+ "values(?,?,?,?,?,?,?)";

	@Override
	public int insertUserDetails(UserInformation userInformation) {
		return jdbcTemplate.update(insert, userInformation.getFirstname(),userInformation.getLastname(),userInformation.getEmailid(),userInformation.getMobilenumber(),userInformation.getGender(),userInformation.getAddress(),userInformation.getPassword());
		
		
		
	}

	@Override
	public UserInformation gerUserByEmailidAndPassword(String emailid, String password) {
		String select ="select * from user_information where email_id=? and password=?";
		RowMapper<UserInformation> map=(mapRow,rowNum)->{ UserInformation information = new UserInformation();
		information.setFirstname(mapRow.getString("first_name"));
		information.setLastname("last_Name");
		information.setEmailid("email_id");
		return information;
		
		};
		try {
			UserInformation userInformation=jdbcTemplate.queryForObject(select, map,emailid,password);
			return userInformation;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<UserInformation> getAllUserInformation() {
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
