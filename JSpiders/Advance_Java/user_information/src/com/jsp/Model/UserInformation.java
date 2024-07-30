package com.jsp.Model;

//used to store the useful information of the user in insertion senario. to transfer the data from one class to another class
public class UserInformation {
	private int id;
	private String firstname;
	private String lastname;
	private String emailid;
	private long mobileno;
	private String gender;
	private String address;
	private String password;

	public UserInformation() {
	}

	public UserInformation(int id, String firstname, String lastname, String emailid, long mobileno, String gender,
			String address, String password) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.gender = gender;
		this.address = address;
		this.password = password;
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailid="
				+ emailid + ", mobileno=" + mobileno + ", gender=" + gender + ", address=" + address + ", password="
				+ password + "]";
	}
	

}
