package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

	
	
	public int findNumberOfNullMarks(Student s[])
	{
		int c=0;
		if (s!=null)
		for (Student i:s)
		{
			try {
			i.getMarks();
			}
			catch(Exception e)
			{
				c++;
			}
		}
		
		return c;
	}
	
	public int findNumberOfNullNames(Student s[])
	{
		int c=0;
		if (s!=null)
		for (Student i:s)
		{
			try
			{
				i.getName();
			}
			catch(Exception e)
			{
				c++;
			}
		}
		
		return c;
	}
	
	public int findNumberOfNullObjects(Student s[])
	{
		int c=0;
		if (s!=null)
		for (Student i:s)
		{
		
			if(i==null)
			c++;
		}
		
		return c;
	}
	
	
	
}
