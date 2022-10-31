package com.xworkz.associations.array.boot;

import com.xworkz.associations.array.constants.Gender;
import com.xworkz.associations.array.thing.City;
import com.xworkz.associations.array.thing.Country;
import com.xworkz.associations.array.thing.Name;
import com.xworkz.associations.array.thing.President;

public class CountryRunner {

	public static void main(String[] args) {

		Country country = new Country("India");
		
		President president = new President("Narendra Modi", 2, Gender.MALE);
		president.show0ff();

	
		Name name = new Name("Jambu Dwipa", "India", "gottilla");
		name.showOff();
		City city1 = new City(name);
		city1.setAreaINSquareKilometers(540);
		city1.display();

		Name name1 = new Name("Bangalore", "Bengaluru", "Finding");
		name1.showOff();
		City city2 = new City(name1);
		city2.display();

		City[] array = { city1, city2 };
		country.setCities(array);
		country.display();


	}

}
