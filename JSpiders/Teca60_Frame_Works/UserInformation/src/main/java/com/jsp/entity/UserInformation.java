package com.jsp.entity;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Details")
public class UserInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "Fist_Name",length = 45)
	private String firstname;
	@Column(name = "Lasr_name", length=45)
	private String lastname;
	@Column(name ="Email_id",unique = true,nullable = false,length = 45)
	private String mailid;
	@Column(unique = true,nullable = false,length = 4)
	private String password;
	@Column(name = "Mobile_Number",unique = true,nullable = false,length = 10)
	private long mobilenumber;
	@Column(length = 6)
	private String gender;
	public UserInformation() {}
	public UserInformation(int id, String firstname, String lastname, String mailid, String password, long mobilenumber,
			String gender) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mailid = mailid;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", mailid="
				+ mailid + ", password=" + password + ", mobilenumber=" + mobilenumber + ", gender=" + gender + "]";
	}
	
	
	
	
}
