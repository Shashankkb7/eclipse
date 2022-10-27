package com.xworkz.association.thing;

public class Mountain {

	public String name;
	public int height;
	public Location location = new Location("street1", "chikkamagalur", "karnataka", 577527, "india");

	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void hattudivi(String street) {
		System.out.println("mountain hattutidare");
		System.out.println("hattutidare:" + street);
		if (location != null) {
			this.location.mountainHattudivi();
		} else {
			System.out.println("location is null");
		}
	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("height:" + this.height);
		this.location.showOff();

	}
}
