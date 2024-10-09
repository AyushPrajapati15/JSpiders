package com.jsp.model;

public class Student {
	private int id;
	private String name;
	private String emailId;
	private String password;
	private double percetage;
	private long mobilenumber;
	private String gender;
	
	
	public Student() {
	}


	public Student(int id, String name, String emailId, String password, double percetage, long mobilenumber,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.percetage = percetage;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
	}

	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public double getPercetage() {
		return percetage;
	}


	public void setPercetage(double percetage) {
		this.percetage = percetage;
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
		return "Student [id=" + id + ", name=" + name + ", emailId=" + emailId + ", password=" + password
				+ ", percetage=" + percetage + ", mobilenumber=" + mobilenumber + ", gender=" + gender + "]";
	}
	
	


}
