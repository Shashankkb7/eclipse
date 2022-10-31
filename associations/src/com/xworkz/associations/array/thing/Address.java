package com.xworkz.associations.array.thing;

public class Address {

	public Location location;

	public Address(Location location) {
		this.location = location;
	}

	public void showOff() {
		System.out.println("location:" + this.location);
	}
}
