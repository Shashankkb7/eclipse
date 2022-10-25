package com.xworkz.boot;

import com.xworkz.constants.LampColor;

public class Lamp {

	public static String brand;
	public String name;
	public int price;
	public LampColor color = LampColor.WHITE;
	public String countryOfOrigin;

	public Lamp(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Brand : " + Lamp.brand);
		System.out.println("Name : " + this.name);
		System.out.println("Price : " + this.price);
		System.out.println("Color : " + this.color);
		System.out.println("Country of Origin : " + this.countryOfOrigin);

	}

	static {
		brand = "LED";
	}
}
