package com.xworkz.rules.Runner;

import com.xworkz.rules.Airport;
import com.xworkz.rules.bridge.Passengers;

public class AirportRunner {

	public static void main(String[] args) {

		Airport airport = new Passengers();
		airport.location();
		airport.name();
		airport.noOfEmployees();
		airport.noOfFlights();
		airport.parking();
	}

}
