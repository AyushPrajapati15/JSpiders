package com.jsp.model;

public class Customer {

	private TajBanjara taj;

	public Customer(TajBanjara taj) {
		this.taj = taj;

	}

	private void thanking() {
		System.out.println("Thank you visit again");

	}

	private void welcome() {
		System.err.println("Welcome to TajBanjara");

	}

	public void display() {
		System.out.println(taj.menu());

	}

}

/*
 * SPRING LIFE CYCLE
 * bean of the classes
 * dependency injection(application context)
 * init method attribute
 * user defined method
 * destroy method after closing the ioc container
 */