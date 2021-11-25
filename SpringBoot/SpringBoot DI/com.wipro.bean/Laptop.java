package com.wipro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

public class Laptop {
	private String lap;
	@Autowired
	private Harddisk hard;
	@Autowired
	private Battery bat;
	public String getLap() {
		return lap;
	}
	public void setLap(String lap) {
		this.lap = lap;
	}
	public Harddisk getHard() {
		return hard;
	}
	public void setHard(Harddisk hard) {
		this.hard = hard;
	}
	public Battery getBat() {
		return bat;
	}
	public void setBat(Battery bat) {
		this.bat = bat;
	}
	public void display() {
		System.out.println("Welcome to Laptop Bean");
		bat.display();
		hard.display();
	}
}
