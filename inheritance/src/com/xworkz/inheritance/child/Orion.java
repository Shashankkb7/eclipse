package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.ShoppingMall;

public class Orion extends ShoppingMall {

	public String ownerName;

	public Orion(String name, String location, String ownerName) {
		super(name, location);
		this.ownerName = ownerName;
	}

	public void display() {
		super.display();
		System.out.println(this.ownerName);
	}

}
