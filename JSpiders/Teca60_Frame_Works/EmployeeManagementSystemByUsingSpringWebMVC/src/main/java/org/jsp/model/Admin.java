package org.jsp.model;

public class Admin {
	
	private int id;
	private String email_id;
	private String name;
	private String password;
	public Admin() {}
	public Admin(int id, String email_id, String name, String password) {
		this.id = id;
		this.email_id = email_id;
		this.name = name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	@Override
//	public String toString() {
//		return "Admin [id=" + id + ", email_id=" + email_id + ", name=" + name + ", password=" + password + "]";
//	}
	
	
	

}