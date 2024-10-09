package com.jsp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
=======
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
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
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.IDENTITY	)
=======
>>>>>>> ff913c96ca3ad915ce256dece5f79146527ce5cf
	private Integer productid;
	private String productname;
	private double price;
	private int quantity;
	private String brand;
	private LocalDate mfdate;
	private LocalDate exdate;
	

}
