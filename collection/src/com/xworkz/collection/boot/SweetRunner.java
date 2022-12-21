package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.TreeSet;

public class SweetRunner {

	public static void main(String[] args) {

		String sweet1 = "Champakali";
		String sweet2 = "Jaamun";
		String sweet3 = "Rasgulla";
		String sweet4 = "Khaja";
		String sweet5 = "Ghevar";
		String sweet6 = "Rabri";
		String sweet7 = "Kaju";
		String sweet8 = "Kheer";
		String sweet9 = "Rasmalai";
		String sweet10 = "Mysore pak";
		String sweet11 = "Jalebi";
		String sweet12 = "Holige";
		String sweet13 = "Barfi";

		Collection<String> collection = new TreeSet<String>();
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);

		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}

}
