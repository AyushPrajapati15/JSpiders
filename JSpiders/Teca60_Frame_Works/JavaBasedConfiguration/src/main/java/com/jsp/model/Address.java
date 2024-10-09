package com.jsp.model;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Address {
	private int pin;
	private String city;
	private String state;
	
	public Address() {
		System.out.println("Address bean created");
	}

	
	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", state=" + state + "]";
	}
	

}
