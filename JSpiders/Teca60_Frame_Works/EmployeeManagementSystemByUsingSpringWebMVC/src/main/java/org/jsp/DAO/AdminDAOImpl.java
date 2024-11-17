package org.jsp.DAO;

import org.jsp.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class AdminDAOImpl implements AdminDao{
	
	@Autowired
	@Qualifier("admintemplate")
	JdbcTemplate jdbcTemplate;
	
	public Admin adminLogin(String email_id,String password)
	{
		String select="select * from admin where EMAILID=? and PASSWORD=? ";
		RowMapper<Admin> map =(rs,rowNum)->{
			Admin admin=new Admin();
			admin.setId(rs.getInt("ID"));
			return admin;
		};
		try {
			Admin admin= jdbcTemplate.queryForObject(select, map,email_id,password);
			return admin;
		} catch (Exception e) {
			return null;
		}
	}
	

}
