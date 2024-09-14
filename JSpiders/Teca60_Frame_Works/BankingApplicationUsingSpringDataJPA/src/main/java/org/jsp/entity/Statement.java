package org.jsp.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the statement database table.
 * 
 */
@Entity
@NamedQuery(name="Statement.findAll", query="SELECT s FROM Statement s")
public class Statement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int transactionId;

	private double balance;

	private BigInteger bankAccountNumber;

	@Temporal(TemporalType.DATE)
	private Date dateoftransaction;

	private Time timeoftransaction;

	private String transactionamount;

	private String transactiontype;

	private int userid;

	public Statement() {
	}

	public int getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BigInteger getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	public void setBankAccountNumber(BigInteger bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public Date getDateoftransaction() {
		return this.dateoftransaction;
	}

	public void setDateoftransaction(Date dateoftransaction) {
		this.dateoftransaction = dateoftransaction;
	}

	public Time getTimeoftransaction() {
		return this.timeoftransaction;
	}

	public void setTimeoftransaction(Time timeoftransaction) {
		this.timeoftransaction = timeoftransaction;
	}

	public String getTransactionamount() {
		return this.transactionamount;
	}

	public void setTransactionamount(String transactionamount) {
		this.transactionamount = transactionamount;
	}

	public String getTransactiontype() {
		return this.transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}