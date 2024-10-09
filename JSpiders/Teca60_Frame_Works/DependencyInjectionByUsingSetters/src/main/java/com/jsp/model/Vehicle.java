package com.jsp.model;

public class Vehicle {
	private String number;
	private String name;
	private String brand;
	private String color;
	private double price;
	private Engine engine;

	// IOC DEPENDENCY INJECTION BY USING SETTERS
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [number=" + number + ", name=" + name + ", brand=" + brand + ", color=" + color + ", price="
				+ price + ", engine=" + engine + "]";
	}

}
