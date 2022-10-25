package com.xworkz.boot;

import com.xworkz.constants.FlowerName;

public class Flower {

	public static double price = 200;
	public FlowerName name = FlowerName.DAISY;
	public String shape;
	public double quantity;
	public String color;

	public Flower(String color) {
		this.color = color;
	}

	public void flowerShape(String shape) {
		this.shape = shape;
	}

	public void totalPrice() {
		double total = price * quantity;
		System.out.println("Total price:" + total);
	}

	public void torsu() {
		System.out.println("Price:" + Flower.price);
		System.out.println("Name:" + this.name);
		System.out.println("Shape:" + this.shape);
		System.out.println("Quantity:" + this.quantity);
		System.out.println("Color:" + this.color);
	}

}
