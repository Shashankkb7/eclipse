package com.xworkz.boot;

import com.xworkz.constants.MangoGrownIn;

public class Mango {

	public static String name = "Raspuri";
	public MangoGrownIn grown = MangoGrownIn.BANGALORE;
	public boolean sweet;
	public double price;
	public double quantity;

	public Mango(boolean sweet) {
		this.sweet = sweet;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("name : " + name);
		System.out.println("grown in : " + this.grown);
		System.out.println("sweet : " + this.sweet);
		System.out.println("price : " + this.price);
		System.out.println("quantity : " + this.quantity);
	}

}
