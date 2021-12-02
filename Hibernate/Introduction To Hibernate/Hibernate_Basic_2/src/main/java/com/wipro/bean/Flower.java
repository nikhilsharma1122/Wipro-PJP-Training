package com.wipro.bean;

public class Flower {
	private String FlowerID;
	private String FlowerName;
	private String Color;
	private int price;
	public Flower() {
		
	}
	public Flower(String FlowerID, String FlowerName, String Color, int price) {
		super();
		this.FlowerID  = FlowerID;
		this.FlowerName = FlowerName;
		this.Color = Color;
		this.price = price;
	}
	public String getFlowerID() {
		return FlowerID;
	}
	public void setFlowerID(String flowerID) {
		FlowerID = flowerID;
	}
	public String getFlowerName() {
		return FlowerName;
	}
	public void setFlowerName(String flowerName) {
		FlowerName = flowerName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "Flower Details Inserted to Database";
	}
}
