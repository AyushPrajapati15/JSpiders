package com.jsp.Model;

public class UserAccountDetails {
	private int id;
	private long accountnumber;
	private String ifsccode;
	private String branch;
	private String accounttype;
	private int userid;
	private double amount;

	public UserAccountDetails() {
	}

	public UserAccountDetails(int id, long accountnumber, String ifsccode, String branch, String accounttype,
			int userid, double amount) {
		super();
		this.id = id;
		this.accountnumber = accountnumber;
		this.ifsccode = ifsccode;
		this.branch = branch;
		this.accounttype = accounttype;
		this.userid = userid;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "UserAccountDetails [id=" + id + ", accountnumber=" + accountnumber + ", ifsccode=" + ifsccode
				+ ", branch=" + branch + ", accounttype=" + accounttype + ", userid=" + userid + ", amount=" + amount
				+ "]";
	}

}
