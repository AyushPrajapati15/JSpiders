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
public class Orders {
	
	@Id
	private Integer orderid;
	private int productid;
	private int customerid;
	private String address;
	private boolean status;
	private double bill;

}
	