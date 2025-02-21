package com.jsp.model;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSal;
	private int empDeptNo;
	private long empMobileNo;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, double empSal, int empDeptNo, long empMobileNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDeptNo = empDeptNo;
		this.empMobileNo = empMobileNo;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public int getEmpDeptNo() {
		return empDeptNo;
	}
	public void setEmpDeptNo(int empDeptNo) {
		this.empDeptNo = empDeptNo;
	}
	public long getEmpMobileNo() {
		return empMobileNo;
	}
	public void setEmpMobileNo(long empMobileNo) {
		this.empMobileNo = empMobileNo;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDeptNo=" + empDeptNo
				+ ", empMobileNo=" + empMobileNo + "]";
	}
	

}
