package com.jsp.model;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private int deptNo;
	
	public Employee() {
		System.out.println("Employee Bean is created");
	}

	public Employee(int id, String name, double salary, int deptNo) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptNo=" + deptNo + "]";
	}
	

}
