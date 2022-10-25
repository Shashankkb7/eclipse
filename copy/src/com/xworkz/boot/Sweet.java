package com.xworkz.boot;

import com.xworkz.constants.SweetColor;

public class Sweet {

	public static String name = "Barfi"; // Static
	public double price; // method
	public String shopName; // constructor
	public SweetColor color = SweetColor.ORANGE; // literal
	public double quantity; // ref

	public Sweet(String shopName) {
		this.shopName = shopName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void totalPrice() {
		double total = price * quantity;
		System.out.println("Total price:" + total);
	}

	public void display() {
		System.out.println("Name:" + Sweet.name);
		System.out.println("Price:" + this.price);
		System.out.println("shopName:" + this.shopName);
		System.out.println("Color:" + this.color);
		System.out.println("quantity:" + this.quantity);
	}
}
