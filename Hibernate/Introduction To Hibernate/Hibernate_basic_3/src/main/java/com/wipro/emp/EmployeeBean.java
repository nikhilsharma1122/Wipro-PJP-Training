package com.wipro.emp;

public class EmployeeBean {
	private String name;
	private int id;
	private String desg;
	private int salary;
	public EmployeeBean() {
		
	}
	public EmployeeBean(String name, int id, String desg, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.desg = desg;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee Name: "+name+"\nEmployee ID: "+id+"\nEmployee Designation: "+desg+"\nSalary: "+salary;
	}
}
