package com.wipro.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.wipro.emp.EmployeeBean;

public class EmployeeAdmin {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		EmployeeBean emp1 = new EmployeeBean("Emp1",101,"Desg1",30000);
		EmployeeBean emp2 = new EmployeeBean("Emp2",101,"Desg2",40000);
		EmployeeBean emp3 = new EmployeeBean("Emp3",101,"Desg3",50000);
		EmployeeBean emp4 = new EmployeeBean("Emp4",101,"Desg4",60000);
		EmployeeBean emp5 = new EmployeeBean("Emp5",101,"Desg5",70000);
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		transaction.commit();
		System.out.println("Record Inserted");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		session.close();
		
	}

}
