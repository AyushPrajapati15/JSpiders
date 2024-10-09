package com.jsp.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;


/**
 * The persistent class for the bankcustomer database table.
 * 
 * to store the data outside the heap area-data persistence
 * 
 */
@Entity
@NamedQuery(name="Bankcustomer.findAll", query="SELECT b FROM Bankcustomer b")
public class Bankcustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int userid;

	private int accountnumber;

	private double amount;

	@Lob
	private LocalDate dateofbirth;

	private String emailid;

	private String gender;

	private long mobileno;

	private int password;

	private String userfirstname;

	private String userlastname;

	public Bankcustomer() {
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getAccountnumber() {
		return this.accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileno() {
		return this.mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public int getPassword() {
		return this.password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getUserfirstname() {
		return this.userfirstname;
	}

	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}

	public String getUserlastname() {
		return this.userlastname;
	}

	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}

	@Override
	public String toString() {
		return "Bankcustomer [userid=" + userid + ", accountnumber=" + accountnumber + ", amount=" + amount
				+ ", dateofbirth=" + dateofbirth + ", emailid=" + emailid + ", gender=" + gender + ", mobileno="
				+ mobileno + ", password=" + password + ", userfirstname=" + userfirstname + ", userlastname="
				+ userlastname + "]";
	}
	
	
	
	

}