package com.wipro.bean;

public class Constructor {
	private String msg;
	public Constructor() {
		super();
	}
	public Constructor(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String toString() {
		return "Message is: "+msg;
	}
}
