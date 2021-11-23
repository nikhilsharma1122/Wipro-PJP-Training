package com.wipro.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wipro.bean.Coupon;

@Repository
@Transactional
public class CouponDao {
	@Autowired
	SessionFactory session;
	@Autowired
	HibernateTemplate template;
	
	public boolean validCode(Coupon coup) {
		Coupon coupon = template.get(Coupon.class, coup.getCouponCode());
		if(coupon!=null) {
			return true;
		}
		return false;
	}
	public float getDiscountPercentage(Coupon coup) {
		Coupon coupon = template.get(Coupon.class, coup.getCouponCode());
		return coupon.getOfferPercentage();
	}
}
