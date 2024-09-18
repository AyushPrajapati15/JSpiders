package com.jsp.model;

public class Employee {
	private int empid;
	private String empName;
	private double empSalary;
	private int empDept;
	private Address address;

	public Employee() {

	}

	public Employee(int empid, String empName, double empSalary, int empDept, Address address) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpDept() {
		return empDept;
	}

	public void setEmpDept(int empDept) {
		this.empDept = empDept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept
				+ ", address=" + address + "]";
	}

}
