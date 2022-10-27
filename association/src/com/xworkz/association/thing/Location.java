package com.xworkz.association.thing;

public class Location {

	public String street;
	public String city;
	public String state;
	public int pincode;
	public String country;

	public Location(String street, String city, String state, int pincode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}

	public void mountainHattudivi() {
		System.out.println("invoking hattutidivi");
	}

	public void mountainIlitidivi() {
		System.out.println("invoking ilitidivi");

	}

	public void showOff() {
		System.out.println("location street:" + this.street);
		System.out.println("location city:" + this.city);
		System.out.println("location state:" + this.state);
		System.out.println("location pincode:" + this.pincode);
		System.out.println("location country:" + this.country);
	}

}
