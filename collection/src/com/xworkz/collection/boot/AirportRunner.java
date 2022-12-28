package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.DTO.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {
		AirportDTO airportDTO1 = new AirportDTO("Kempegowda Airport", "Bangalore", "International");
		AirportDTO airportDTO2 = new AirportDTO("Mangalore Airport", "Mangalore", "International");
		AirportDTO airportDTO3 = new AirportDTO("Hubli Airport", "Hubli", "Domestic");
		AirportDTO airportDTO4 = new AirportDTO("Mangalore Airport", "Mangalore", "International");
		AirportDTO airportDTO5 = new AirportDTO("Belagavi Airport", "Belagavi", "Domestic");

		boolean equals = airportDTO2.equals(airportDTO4);
		System.out.println(equals);

		Collection<AirportDTO> collection = new ArrayList<AirportDTO>();
		collection.add(airportDTO1);
		collection.add(airportDTO2);

		boolean contains = collection.contains(airportDTO2);
		System.out.println("contains " + contains);
	}

}
