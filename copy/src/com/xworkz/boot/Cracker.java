package com.xworkz.boot;

import com.xworkz.constants.CrackerShape;

public class Cracker {

	public static String name;
	public boolean noise;
	public double price;
	public double quantity;
	public CrackerShape shape = CrackerShape.TRIANGLE;

	public Cracker(boolean noise) {
		this.noise = noise;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void totalPrice() {
		double total = price * quantity;
		System.out.println("Total price:" + total);
	}

	public void show() {
		System.out.println("Name:" + Cracker.name);
		System.out.println("Noise:" + this.noise);
		System.out.println("Price:" + this.price);
		System.out.println("Quantity:" + this.quantity);
		System.out.println("Shape:" + this.shape);

	}

	static {
		name = "Standard";
	}
}
