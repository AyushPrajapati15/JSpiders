package com.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Admin {
	
	@Id
	private int adminid;
	private String adminmail;
	private String adminname;
	private String adminpassword;

}
	