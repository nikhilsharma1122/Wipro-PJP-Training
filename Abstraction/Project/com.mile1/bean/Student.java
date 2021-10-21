package com.mile1.bean;

public class Student {
	
	
	String name;
	int marks[];
	String grade;
	public Student()
	{
		name="";
		grade="";
	}
	public Student(String name,int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
		grade="";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks; 
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
