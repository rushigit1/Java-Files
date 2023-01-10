package com.java;
public class BankEmployee {
	private int empId;
	private String empName;
	private String city ;
	private double salary;
	public BankEmployee(int empId, String empName, String city, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}
	public int getempId() {
		return empId;
	}
	public void setempId(int empId) {
		this.empId = empId;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}


