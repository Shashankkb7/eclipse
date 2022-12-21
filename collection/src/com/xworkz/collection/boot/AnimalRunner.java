package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {

		String animal1 = "Tiger";
		String animal2 = "Lion";
		String animal3 = "Elephant";
		String animal4 = "Dog";
		String animal5 = "Cat";
		String animal6 = "Cow";
		String animal7 = "Buffalo";
		String animal8 = "Goat";
		String animal9 = "Sheep";
		String animal10 = "Fox";

		Collection<String> animals = new ArrayList<String>();
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		animals.add(animal7);
		animals.add(animal8);
		animals.add(animal9);
		animals.add(animal10);

		for (String ref : animals) {
			System.out.println(ref);
		}
		System.out.println("======Iterator======");

		Iterator<String> itr = animals.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
		}

	}

}
