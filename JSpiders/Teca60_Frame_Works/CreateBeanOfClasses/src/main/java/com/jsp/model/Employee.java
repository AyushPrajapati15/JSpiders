package com.jsp.model;

public class Employee {

	private int id;
	private int deptno;
	private double sal;
	private String name;

	public Employee() {
		System.out.println("Creating bean class");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", deptno=" + deptno + ", sal=" + sal + ", name=" + name + "]";
	}

}
