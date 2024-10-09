package org.jsp.model;

/**
 * 
 */
public class UserInformation {
	private String firstname;
	private String lastname;
	private String emailid;
	private String password;
	private long mobilenumber;
	private String gender;
	private String address;
	public UserInformation() {
	}
	public UserInformation(String firstname, String lastname, String emailid, String password, long mobilenumber,
			String gender, String address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.address = address;
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserInformation [firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid
				+ ", password=" + password + ", mobilenumber=" + mobilenumber + ", gender=" + gender + ", address="
				+ address + "]";
	}
	
	
	

	
	

}
