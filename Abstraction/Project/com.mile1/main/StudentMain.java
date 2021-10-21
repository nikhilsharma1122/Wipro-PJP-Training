package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
public class StudentMain {

	public static Student data[]= new Student[10];
	
	static
	{
		for (int i=0;i< data.length;i++)
		{
			data[i]=new Student();
		}
		data[0]=new Student("Sekar",new int[] {85,75,95});
		data[1]=new Student(null,new int[] {11,22,33});
		data[2]=null;
		data[3]=new Student("Manoj",null);
		data [4] = new Student("John", new int[] {90, 92, 80}); // TC1
		data [5] = new Student("Bob", new int[] {35, 40, 50}); // TC2
		data [6] = null; // TC3
		data [7] = new Student(null, new int[] {25, 29, 28}); // TC4
		data [8] = new Student("Arnold", null); // TC5
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StudentService s=new StudentService();
     StudentReport sr=new StudentReport();
     System.out.println("Grade Calculation:");
     
     for (Student i :data)
     {
    	 try
     {
    	 System.out.println("Grade :"+sr.validate(i));
    		
     }
     catch(Exception e)
     {
    	 System.out.println(e);
     }
     }
     
     
     System.out.println("null marks :"+s.findNumberOfNullMarks(data));
     System.out.println("null names :"+s.findNumberOfNullNames(data));
     System.out.println("null objects :"+s.findNumberOfNullObjects(data));
     
     //TC6
     System.out.println("TC6: Number of Objects with Name as null :" +
				s.findNumberOfNullNames(data));		
	// TC7
	System.out.println("TC7: Number of Objects that are null :" +
				s.findNumberOfNullObjects(data));
	// TC8
	System.out.println("TC8: Number of Objects with Marks array as null :" +
				s.findNumberOfNullMarks(data));
     
	}
	

}
