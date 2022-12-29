package com.xworkz.collection.boot;

import java.util.List;
import java.util.ArrayList;

public class ListRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("S");
		list.add("H");

		list.add(2, "A"); // add(index,element)

		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("=========================");
		list.add("S");
		System.out.println("After adding duplicate");
		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("=========================");
		list.set(1, "h");
		list.set(2, "a");
		System.out.println("After Replace");

		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("=========================");
		System.out.println("Element size before remove " + list.size());
		list.remove("S");
		System.out.println("Element size After remove " + list.size());

		for (String string : list) {
			System.out.println(string);
		}

		list.remove(1);
		System.out.println("Element size After remove by using index value " + list.size());
		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("=========================");
		list.get(1);
		System.out.println("Element of index 1 is " + list.get(1));

	}

}
