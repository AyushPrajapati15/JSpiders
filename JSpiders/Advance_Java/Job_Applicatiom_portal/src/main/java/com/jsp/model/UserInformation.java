package com.jsp.model;

public class UserInformation {

	private int id;
	private String First_Name;
	private String Last_Name;
	private long Mobile_Number;
	private String Email_Id;
	private String Password;
	private String Qualification;
	private double Percentage;
	private String Gender;

	public UserInformation() {
	}

	public UserInformation(int id, String first_Name, String last_Name, long mobile_Number, String email_Id,
			String password, String qualification, double percentage, String gender) {
		this.id = id;
		First_Name = first_Name;
		Last_Name = last_Name;
		Mobile_Number = mobile_Number;
		Email_Id = email_Id;
		Password = password;
		Qualification = qualification;
		Percentage = percentage;
		Gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public long getMobile_Number() {
		return Mobile_Number;
	}

	public void setMobile_Number(long mobile_Number) {
		Mobile_Number = mobile_Number;
	}

	public String getEmail_Id() {
		return Email_Id;
	}

	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public double getPercentage() {
		return Percentage;
	}

	public void setPercentage(double percentage) {
		Percentage = percentage;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", Mobile_Number=" + Mobile_Number + ", Email_Id=" + Email_Id + ", Password=" + Password
				+ ", Qualification=" + Qualification + ", Percentage=" + Percentage + ", Gender=" + Gender + "]";
	}

}
