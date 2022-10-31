package com.xworkz.associations.array.thing;

public class Country {

	public String name;
	public President president;
	public City[] cities;

	public Country(String name) {
		this.name = name;
	}

	public void setPresident(President president) {
		this.president = president;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.president);
		System.out.println(this.cities);

		if (cities != null) {
			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];
				if (city != null) {
					city.display();
				}
			}
		} else {
			System.out.println("cities is null");
		}
	if(this.president!=null) 
		president.show0ff();
	}
	
}