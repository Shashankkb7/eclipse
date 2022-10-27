package com.xworkz.association.boot;

import com.xworkz.association.constants.FuelType;
import com.xworkz.association.thing.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fuel fuel = new Fuel(true, 5.5, FuelType.PETROL);
		fuel.haktidare("darshan");
		fuel.haktidare("sudeep");
		fuel.display();
	}

}
