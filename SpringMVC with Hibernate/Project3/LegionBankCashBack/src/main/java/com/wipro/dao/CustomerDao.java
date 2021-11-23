package com.wipro.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.bean.Customer;

@Repository
@Transactional
public class CustomerDao {
	@Autowired
	SessionFactory session;
	
	@Autowired
	HibernateTemplate template;
	
	public String customerExist(Customer cust) {
		Customer customer = template.get(Customer.class, cust.getCustomerID());
		if(customer!=null) {
			if(cust.getPassword().equals(customer.getPassword())) {
				return "success";
			}
			else {
				return "incorrectDetials";
			}
		}
		return "usernotfound";
	}
	public float getBalance(String custID) {
		Customer customer = template.get(Customer.class, custID);
		return customer.getBalance();
	}
	public void updateBalance(String custID,float bal) {
		Customer cust = template.get(Customer.class, custID);
		cust.setBalance(bal);
		template.update(cust);
	}
}
