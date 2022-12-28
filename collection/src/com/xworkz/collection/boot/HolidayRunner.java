package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.DTO.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {

		HolidayDTO holidayDTO1 = new HolidayDTO("Government", 5, "Sick");
		HolidayDTO holidayDTO2 = new HolidayDTO("Private", 5, "Casual");
		HolidayDTO holidayDTO3 = new HolidayDTO("Government", 3, "Sick");
		HolidayDTO holidayDTO4 = new HolidayDTO("Government", 12, "Annual");
		HolidayDTO holidayDTO5 = new HolidayDTO("Private", 5, "Marriage");

		boolean equals = holidayDTO1.equals(holidayDTO3);
		System.out.println(equals);
		System.out.println("==========================");

		Collection<HolidayDTO> collection = new ArrayList<HolidayDTO>();
		collection.add(holidayDTO1);
		collection.add(holidayDTO2);

		boolean contains = collection.contains(holidayDTO3);
		System.out.println("Contains " + contains);

	}

}
