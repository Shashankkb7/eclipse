package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.DTO.CalenderDTO;

public class CalenderRunner {

	public static void main(String[] args) {
		CalenderDTO calenderDTO1 = new CalenderDTO("Mallige", "Kannada", 50D);
		CalenderDTO calenderDTO2 = new CalenderDTO("Bhagyalaksmi", "Kannada", 100D);
		CalenderDTO calenderDTO3 = new CalenderDTO("Mallige", "Kannada", 70D);
		CalenderDTO calenderDTO4 = new CalenderDTO("Gregorian", "English", 60D);
		CalenderDTO calenderDTO5 = new CalenderDTO("National", "English", 80D);

		boolean equals = calenderDTO1.equals(calenderDTO3);
		System.out.println(equals);

		Collection<CalenderDTO> collection = new ArrayList<CalenderDTO>();
		collection.add(calenderDTO1);
		collection.add(calenderDTO2);

		boolean contains = collection.contains(calenderDTO3);
		System.out.println("Contains " + contains);

	}

}
