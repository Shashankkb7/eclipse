package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {

	public static void main(String[] args) {

		String watch1 = "Titan";
		String watch2 = "Fastrack";
		String watch3 = "Sonata";
		String watch4 = "HMT";
		String watch5 = "Fossil";

		Collection<String> watches = new ArrayList<String>();
		watches.add(watch1);
		watches.add(watch2);
		watches.add(watch3);
		watches.add(watch4);
		watches.add(watch5);

		for (String ref : watches) {
			System.out.println(ref);
		}

		System.out.println("======Iterator======");

		Iterator<String> iterator = watches.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

	}

}
