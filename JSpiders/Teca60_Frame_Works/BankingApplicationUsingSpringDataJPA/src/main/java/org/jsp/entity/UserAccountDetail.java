package org.jsp.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the user_account_details database table.
 * 
 */
@Entity
@Table(name="user_account_details")
@NamedQuery(name="UserAccountDetail.findAll", query="SELECT u FROM UserAccountDetail u")
public class UserAccountDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private BigInteger account_Number;

	private String account_Type;

	private double amount;

	private String branch;

	private String IFSC_Code;

	private int user_Id;

	public UserAccountDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getAccount_Number() {
		return this.account_Number;
	}

	public void setAccount_Number(BigInteger account_Number) {
		this.account_Number = account_Number;
	}

	public String getAccount_Type() {
		return this.account_Type;
	}

	public void setAccount_Type(String account_Type) {
		this.account_Type = account_Type;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIFSC_Code() {
		return this.IFSC_Code;
	}

	public void setIFSC_Code(String IFSC_Code) {
		this.IFSC_Code = IFSC_Code;
	}

	public int getUser_Id() {
		return this.user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

}