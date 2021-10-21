package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {
	public String findGrades(Student studentobject) {
		int marks[] = studentobject.getMarks();
		if(marks[0]<35||marks[1]<35||marks[2]<35) {
			return "F";
		}
		else {
			int sum = marks[0]+marks[1]+marks[2];
			if(sum<=150) {
				return "D";
			}
			else if(sum>150 && sum<=200) {
				return "B";
			}
			else if(sum>200 && sum<=250) {
				return "A";
			}
			else {
				return "A+";
			}
		}	
	}
	

public String validate(Student studentobject) throws NullNameException, NullMarksArrayException, NullStudentObjectException{
	if(studentobject == null) {
		throw new NullStudentObjectException();
	}
	else {
		if(studentobject.getName() == null || studentobject.getName().isEmpty()) {
			throw new NullNameException();
		}
		else if(studentobject.getMarks() == null) {
			throw new NullMarksArrayException();
		}
		else {
			return findGrades(studentobject);
			//return findGrade(studentobject);
		}
	}
}
}


