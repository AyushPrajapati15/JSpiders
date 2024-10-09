package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {
	@Id
	private Integer cartid;
	private double totalamount;
	private int productid;
	private int noofproduct;
	private int customerid;
	

}
