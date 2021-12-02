package com.wipro.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.emp.Employee;

public class EmployeeAdmin {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Employee emp = new Employee("NN",101,"TT");
		session.save(emp);
		transaction.commit();
		System.out.println("Record Inserted");
		System.out.println(emp);
		session.close();
		
	}

}
