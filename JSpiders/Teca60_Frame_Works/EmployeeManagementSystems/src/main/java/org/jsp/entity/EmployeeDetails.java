package org.jsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Details")
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Emp_Name",nullable = false)
	private String name;
	@Column(name="Emp_Salary",nullable = false)
	private double salary;
	@Column(name = "Emp_deptNo",nullable = false,unique = true)
	private int deptno;
	@Column(name="Emp_mobileNo",nullable=false)
	private long mobilenumber;
	@Column(name="Emp_password",nullable=false)
	private String password;
	@Column(name="Emp_gender",nullable = false)
	private String gender;
	public EmployeeDetails() {
		
	}
	
	public EmployeeDetails(int id, String name, double salary, int deptno, long mobilenumber, String password,String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptno = deptno;
		this.mobilenumber = mobilenumber;
		this.password = password;
		this.gender=gender;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", salary=" + salary + ", deptno=" + deptno
				+ ", mobilenumber=" + mobilenumber + ", password=" + password + "]";
	}
	

}
