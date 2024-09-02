package com.jsp.model;

public class Address {
	private int pin;
	private String state;
	private String city;
	public Address() {
	}
	public Address(int pin, String state, String city) {
		this.pin = pin;
		this.state = state;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", state=" + state + ", city=" + city + "]";
	}
	
	
	
	
	
	
	

}
