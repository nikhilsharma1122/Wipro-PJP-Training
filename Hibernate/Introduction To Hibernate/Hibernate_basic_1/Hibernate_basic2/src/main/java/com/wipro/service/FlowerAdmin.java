package com.wipro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class FlowerAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Flower emp = new Flower("1","Lily","Blue",100);
		session.save(emp);
		transaction.commit();
		System.out.println("Record Inserted");
		System.out.println(emp);
		session.close();
		

	}

}
