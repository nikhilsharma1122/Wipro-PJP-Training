package com.wipro.emp;

public class Employee {
	private String empname;
	private int empID;
	private String empdesg;
	public Employee() {
		
	}
	public Employee(String empname, int empID, String empdesg) {
		super();
		this.empname=empname;
		this.empID = empID;
		this.empdesg=empdesg;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpdesg() {
		return empdesg;
	}
	public void setEmpdesg(String empdesg) {
		this.empdesg = empdesg;
	}
	public String toString() {
		return "Employee Name: "+empname+"\nEmployee ID: "+empID+"\nEmployee Designation: "+empdesg;
	}
}
