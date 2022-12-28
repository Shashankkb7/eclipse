package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.DTO.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {

		PlaceDTO placeDTO1 = new PlaceDTO("Chikkamagalur", 577516, "Mullayangiri");
		PlaceDTO placeDTO2 = new PlaceDTO("Chitradurga", 577515, "Fort");
		PlaceDTO placeDTO3 = new PlaceDTO("Chikkamagalur", 577516, "Mullayangiri");
		PlaceDTO placeDTO4 = new PlaceDTO("Shivamogga", 577518, "Jog falls");
		PlaceDTO placeDTO5 = new PlaceDTO("Bangalore", 577519, "Silicon city");

		boolean equals = placeDTO1.equals(placeDTO3);
		System.out.println(equals);

		Collection<PlaceDTO> collection = new ArrayList<PlaceDTO>();
		collection.add(placeDTO1);
		collection.add(placeDTO2);

		boolean contains = collection.contains(placeDTO3);
		System.out.println(contains);
	}

}
