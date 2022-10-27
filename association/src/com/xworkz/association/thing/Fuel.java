package com.xworkz.association.thing;

import com.xworkz.association.constants.FuelType;

public class Fuel {

	public boolean special;
	public double quantity;
	public FuelType fuel = FuelType.PETROL;
	public Brand brand = new Brand("Bhararth petroleum", 45012520000L, "Rajajinagar", 5);

	public Fuel(boolean special, double quantity, FuelType fuel) {
		super();
		this.special = special;
		this.quantity = quantity;
		this.fuel = fuel;
	}

	public void haktidare(String name) {
		System.out.println("petrol haktidare");
		System.out.println("haktidare:" + name);
		if (brand != null) {
			this.brand.petrolStart();
		} else {
			System.out.println("brand is null");
		}
	}

	public void display() {
		System.out.println("special:" + this.special);
		System.out.println("quantity:" + this.quantity);
		System.out.println("fuel:" + this.fuel);
		this.brand.showOff();
	}
}
