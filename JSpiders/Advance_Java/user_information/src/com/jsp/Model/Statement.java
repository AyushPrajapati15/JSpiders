package com.jsp.Model;

import java.sql.Date;
import java.sql.Time;

public class Statement {
	private Date dateoftransaction;
	private Time timeoftransaction;
	private String transactiontype;
	private String transactionamount;
	private double balance;
	private int transactionId;
	private long bankAccountNumber;
	private int userid;

	public Statement() {
		super();
	}

	public Statement(Date dateoftransaction, Time timeoftransaction, String transactiontype, String transactionamount,
			double balance, int transactionId, long bankAccountNumber, int userid) {
		super();
		this.dateoftransaction = dateoftransaction;
		this.timeoftransaction = timeoftransaction;
		this.transactiontype = transactiontype;
		this.transactionamount = transactionamount;
		this.balance = balance;
		this.transactionId = transactionId;
		this.bankAccountNumber = bankAccountNumber;
		this.userid = userid;
	}

	public Date getDateoftransaction() {
		return dateoftransaction;
	}

	public void setDateoftransaction(Date dateoftransaction) {
		this.dateoftransaction = dateoftransaction;
	}

	public Time getTimeoftransaction() {
		return timeoftransaction;
	}

	public void setTimeoftransaction(Time timeoftransaction) {
		this.timeoftransaction = timeoftransaction;
	}

	public String getTransactiontype() {
		return transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public String getTransactionamount() {
		return transactionamount;
	}

	public void setTransactionamount(String transactionamount) {
		this.transactionamount = transactionamount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Statement [dateoftransaction=" + dateoftransaction + ", timeoftransaction=" + timeoftransaction
				+ ", transactiontype=" + transactiontype + ", transactionamount=" + transactionamount + ", balance="
				+ balance + ", transactionId=" + transactionId + ", bankAccountNumber=" + bankAccountNumber
				+ ", userid=" + userid + "]";
	}

}
