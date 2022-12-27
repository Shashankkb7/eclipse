package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.DTO.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {

		SanitizerDTO dto1 = new SanitizerDTO(1, "Dettol", "Color less", 10);
		SanitizerDTO dto2 = new SanitizerDTO(2, "Lifeboy", "Pink", 20);
		SanitizerDTO dto3 = new SanitizerDTO(3, "Himalaya", "Blue", 60);
		SanitizerDTO dto4 = new SanitizerDTO(4, "Redcop", "White", 5);
		SanitizerDTO dto5 = new SanitizerDTO(5, "Savlon", "Dark blue", 7);
		SanitizerDTO dto6 = new SanitizerDTO(6, null, "Orange", 3);
		SanitizerDTO dto7 = new SanitizerDTO(7, "Austro Labs", "Green", 8);
		SanitizerDTO dto8 = new SanitizerDTO(8, "23 Yards", null, 50);
		SanitizerDTO dto9 = new SanitizerDTO(9, "Arogya", "Red", 0);
		SanitizerDTO dto10 = new SanitizerDTO(10, "Black bull", "Yellow", 90);

		Collection<SanitizerDTO> collection = new LinkedList<SanitizerDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);

		Iterator<SanitizerDTO> greater = collection.iterator();
		while (greater.hasNext()) {
			SanitizerDTO element = greater.next();
			if (element.getPrice() > 5) {
				System.out.println("Printing sanitizer is greater than 5 rupees " + element);
			}
		}
		System.out.println("====================================");

		Iterator<SanitizerDTO> checkingNull = collection.iterator();
		while (checkingNull.hasNext()) {
			SanitizerDTO element = checkingNull.next();
			if (element.getBrand() == null || element.getColor() == null) {
				System.out.println("Printing null value sanitizer " + element);
			}
		}
		System.out.println("====================================");

		Iterator<SanitizerDTO> checkingColor = collection.iterator();
		while (checkingColor.hasNext()) {
			SanitizerDTO element = checkingColor.next();
			if (element.getColor() == "Green" || element.getColor() == "Blue" || element.getColor() == "Red") {
				System.out.println("Removing sanitizer it has color red or blue or green " + element);
				checkingColor.remove();
			}
		}
		System.out.println("====================================");

		Iterator<SanitizerDTO> max = collection.iterator();
		while (max.hasNext()) {
			SanitizerDTO element = max.next();
			if (element.getPrice() > 70) {
				System.out.println("Printing sanitizer max rupees " + element);
			}

		}
		Iterator<SanitizerDTO> secondMax = collection.iterator();
		while (secondMax.hasNext()) {
			SanitizerDTO element = secondMax.next();
			if (element.getPrice() > 55) {
				System.out.println("Printing sanitizer second Max " + element);
			}
		}
		Iterator<SanitizerDTO> min = collection.iterator();
		while (min.hasNext()) {
			SanitizerDTO element = min.next();
			if (element.getPrice() < 5) {
				System.out.println("Printing sanitizer is minimum rupees " + element);
			}
		}

	}
}
