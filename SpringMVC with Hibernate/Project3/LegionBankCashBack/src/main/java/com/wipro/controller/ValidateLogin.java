package com.wipro.controller;

import javax.servlet.http.HttpSession;

public class ValidateLogin {
	
	HttpSession session;
	public ValidateLogin() {
		this.session = session;
	}
	public boolean isLoggedIn() {
		boolean validUser = false;
		if(session!=null) {
			String username = (String)session.getAttribute("customerID");
			String password = (String) session.getAttribute("password");
			if(username!=null && password!=null) {
				validUser = true;
			}
		}
		return validUser;
	}
}
