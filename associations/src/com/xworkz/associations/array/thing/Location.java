package com.xworkz.associations.array.thing;

public class Location {

	public int no;
	public String street;
	public State state;
	public Countries countries;
	public Cities cities;

	public Location(int no, String street) {
		super();
		this.no = no;
		this.street = street;
	}

	public void setAddress(State state, Countries countries, Cities cities) {
		this.state = state;
		this.countries = countries;
		this.cities = cities;
	}

	public void showOff() {
		System.out.println("location no:" + this.no);
		System.out.println("location street:" + this.street);

		if (state != null) {
			System.out.println("state is printing:" + this.state);
			this.state.showOff();
		}
		if (countries != null) {
			System.out.println("countries is printing:" + this.countries);
			this.countries.showOff();
		}
		if (cities != null) {
			System.out.println("cities is printing:" + this.cities);
			this.cities.showOff();
		}
	}

}
