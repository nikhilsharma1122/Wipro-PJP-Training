package com.wipro.bean;

import org.springframework.stereotype.Component;

@Component
public class Harddisk {
	private String hard;

	public String getHard() {
		return hard;
	}

	public void setHard(String hard) {
		this.hard = hard;
	}
	
	public void display() {
		System.out.println("Welcome to Hard-disk bean");
	}
}
