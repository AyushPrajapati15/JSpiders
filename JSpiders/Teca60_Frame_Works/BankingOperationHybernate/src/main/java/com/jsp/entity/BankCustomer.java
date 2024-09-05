package com.jsp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.crypto.Data;
//@Setter
//@Getter

@AllArgsConstructor
@NoArgsConstructor
// @ToString
@lombok.Data
@Entity
@NamedQuery(name = "selectcustomerbyemailidandassword", query = "select bankcustomer from BankCustomer  bankcustomer where bankcustomer.emailId=?1 and bankcustomer.password=?2")
@NamedQueries({
		@NamedQuery(name = "updatecustomeramount", query = "update BankCustomer bankcustomer set  bankcustomer.amount=?1 where bankcustomer.accountNumber=?2") })
public class BankCustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(nullable = false)
	private String userFirstName;
	@Column(nullable = false)
	private String userLastName;
	@Column()
	private LocalDate dateOfBirth;
	@Column(nullable = false, length = 6)
	private String gender;
	@Column(length = 45, nullable = false, unique = true)
	private String emailId;
	@Column(length = 4, nullable = false, unique = true)
	private int password;
	@Column(length = 10, nullable = false, unique = true)
	private long mobileNo;
	@Column(nullable = false)
	private double amount;
	@Column(length = 7, nullable = false, unique = true)
	private int accountNumber;

}
