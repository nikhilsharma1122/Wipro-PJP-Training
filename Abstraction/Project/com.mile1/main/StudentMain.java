package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student data[] = new Student[4];
	StudentMain() {
		for(int i = 0;i<data.length;i++) {
			data[i]= new Student();
		}
		data[0] = new Student("Sekar",new int[] {85,75,95,65});
		data[1] = new Student(null,new int[] {11,22,33});
		data[2] = null;
		data[3] = new Student("Manoj",null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentReport studentreport = new StudentReport();
		StudentService studentservice = new StudentService();
		String grade = null;
		for(Student student:data) {
			try {
				grade = studentreport.validate(student);
			}catch(NullMarksArrayException e) {
				grade="NullMarksArrayException occured";
			} catch (NullNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullStudentObjectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Grade = "+grade);
		}
		System.out.println("Number of objects with Marks array as null = "+studentservice.findNumberOfNullMarksArray(data));
		System.out.println("Number of objects with Name as null = "+studentservice.findNumberOfNullName(data));
		System.out.println("Number of objects with Name as null = "+studentservice.findNumberOfNullObjects(data));
	}

}
