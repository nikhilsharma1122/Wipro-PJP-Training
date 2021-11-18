package com.wipro.bean;

public class Student {
	private String studentID;
	private String studentName;
	private Test studentTest;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Test getStudentTest() {
		return studentTest;
	}
	public void setStudentTest(Test studentTest) {
		this.studentTest = studentTest;
	}
	public void display() {
		System.out.println("ID:" + this.getStudentID());
		System.out.println("Name:" + this.getStudentName());
		System.out.println("Test ID:" + this.getStudentTest().getTestId());
		System.out.println("Test Title:" + this.getStudentTest().getTestTitle());
		System.out.println("Test Marks:" + this.getStudentTest().getTestMarks());
		System.out.println();
	}
}
