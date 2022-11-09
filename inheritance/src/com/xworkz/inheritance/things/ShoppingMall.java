package com.xworkz.inheritance.things;

//overriding
public class ShoppingMall {

	public String name;
	public String location;

	public ShoppingMall(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.location);
	}

}
