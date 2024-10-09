package com.jsp.model;

public class Student {
	
	private int std_id; 
	private String std_name; 
	private int marks;
	private String std_gender; 
	private String std_email;
	private String std_password; 
	private int std_percent; 
	private String std_stream;
	
	public Student() {
	}

	public Student(int std_id, String std_name, int marks, String std_gender, String std_email, String std_password,
			int std_percent, String std_stream) {
		this.std_id = std_id;
		this.std_name = std_name;
		this.marks = marks;
		this.std_gender = std_gender;
		this.std_email = std_email;
		this.std_password = std_password;
		this.std_percent = std_percent;
		this.std_stream = std_stream;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStd_gender() {
		return std_gender;
	}

	public void setStd_gender(String std_gender) {
		this.std_gender = std_gender;
	}

	public String getStd_email() {
		return std_email;
	}

	public void setStd_email(String std_email) {
		this.std_email = std_email;
	}

	public String getStd_password() {
		return std_password;
	}

	public void setStd_password(String std_password) {
		this.std_password = std_password;
	}

	public int getStd_percent() {
		return std_percent;
	}

	public void setStd_percent(int std_percent) {
		this.std_percent = std_percent;
	}

	public String getStd_stream() {
		return std_stream;
	}

	public void setStd_stream(String std_stream) {
		this.std_stream = std_stream;
	}

	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", marks=" + marks + ", std_gender="
				+ std_gender + ", std_email=" + std_email + ", std_password=" + std_password + ", std_percent="
				+ std_percent + ", std_stream=" + std_stream + "]";
	}
	
	
	

}
