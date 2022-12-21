package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityRunner {

	public static void main(String[] args) {

		String metro1 = "Bangalore";
		String metro2 = "Delhi";
		String metro3 = "Hyderabad";
		String metro4 = "Mumbai";
		String metro5 = "Chennai";

		Collection<String> metro = new ArrayList<String>();
		metro.add(metro1);
		metro.add(metro2);
		metro.add(metro3);
		metro.add(metro4);
		metro.add(metro5);

		for (String ref : metro) {
			System.out.println(ref);
		}

		System.out.println("======Iterator====");

		Iterator<String> iterator = metro.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
