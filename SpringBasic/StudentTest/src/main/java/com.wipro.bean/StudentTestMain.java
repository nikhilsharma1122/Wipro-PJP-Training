package com.wipro.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentTest.xml");
		Student s1 = context.getBean("student1",Student.class);
		Student s2 = context.getBean("student2",Student.class);
		s1.display();
		s2.display();
	}

}
