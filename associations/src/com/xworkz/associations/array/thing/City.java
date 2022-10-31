package com.xworkz.associations.array.thing;

public class City {

	public Name name;
	public boolean capital;
	public double areaINSquareKilometers;

	public City(Name name) {
		this.name = name;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public void setAreaINSquareKilometers(double areaINSquareKilometers) {
		this.areaINSquareKilometers = areaINSquareKilometers;
	}

	public void display() {
		System.out.println("displaying city");
		System.out.println(this.capital);
		System.out.println(this.areaINSquareKilometers);
		if (name != null) {
			System.out.println(this.name);
			this.name.showOff();
		}
	}
}
