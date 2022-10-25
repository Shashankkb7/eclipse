package com.xworkz.boot;

import com.xworkz.constants.MilkBrandHeadquarters;

public class Milk {

	public static String brand = "Dodla";
	public String name;
	public int price;
	public int quantity;
	public MilkBrandHeadquarters headQuaters = MilkBrandHeadquarters.TUMKUR;

	public Milk(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void display() {
		System.out.println("brand : " + Milk.brand);
		System.out.println("name : " + this.name);
		System.out.println("price : " + this.price);
		System.out.println("quantity : " + this.quantity);
		System.out.println("headQuaters : " + this.headQuaters);

	}

}
