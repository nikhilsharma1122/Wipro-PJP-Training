package com.wipro.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.emp.Product;

public class ProductAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Product p1 = new Product("P1",1,100);
		Product p2 = new Product("P3",3,100);
		Product p3 = new Product("P2",2,100);
		Product p4 = new Product("P5",5,100);
		Product p5 = new Product("P4",4,100);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(p5);
		transaction.commit();
		System.out.println("Record Inserted");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		session.close();
	}	

}
