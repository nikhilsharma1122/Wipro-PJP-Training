package com.wipro.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorSpingIOCmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
		Constructor c = context.getBean(Constructor.class);
		System.out.println(c);
	}

}
