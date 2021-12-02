package com.wipro.emp;

public class Product {
	private String ProductName;
	private int ProductId;
	private int Price;
	public Product() {
		
	}
	public Product(String ProductName, int ProductId, int Price) {
		super();
		this.ProductName=ProductName;
		this.ProductId=ProductId;
		this.Price=Price;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String toString() {
		return "Product Name: "+ProductName+"\nProductId: "+ProductId+"\nPrice: "+Price;
	}
}
