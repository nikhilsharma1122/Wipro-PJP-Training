package com.wipro.bean;

import org.springframework.stereotype.Component;

@Component

public class Battery {
	private String bat;

	public String getBat() {
		return bat;
	}

	public void setBat(String bat) {
		this.bat = bat;
	}
	public void display() {
		System.out.println("Welcome to Battery Bean");
	}
}
