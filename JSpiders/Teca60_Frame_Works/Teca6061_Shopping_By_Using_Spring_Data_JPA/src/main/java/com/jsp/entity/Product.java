package com.jsp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	
	@Id
	private Integer productid;
	private String productname;
	private double price;
	private int quantity;
	private String brand;
	private LocalDate mfdate;
	private LocalDate exdate;
	

}
