package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {

	public String findGrades(Student s)
	{
		int[] marks = s.getMarks();
		int marksSum = 0;
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 35) {
				return "F";
			} else {
				marksSum += marks[i];
			}
		}
		
		if (marksSum <= 150) return "D";
		else if (marksSum > 150 && marksSum <= 200) return "C";
		else if (marksSum > 200 && marksSum <= 250) return "B";
		else if (marksSum > 250 && marksSum <= 300) return "A";
		
		return "D";
	}
	
	public String validate(Student i) throws NullNameException,NullMarksArrayException,NullStudentObjectException
	{
		
			if(i==null)
				throw new NullStudentObjectException();
			else if(i.getMarks()==null)
				throw new NullMarksArrayException();
			else if (i.getName()==null)
				throw new NullNameException();
			else 
				return findGrades(i);
			
	}
	
	
}
