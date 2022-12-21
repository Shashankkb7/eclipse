package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.TreeSet;

public class BikeRunner {

	public static void main(String[] args) {

		String bike1 = "RE Himalyan";
		String bike2 = "RE Classic 350";
		String bike3 = "RE Hunter";
		String bike4 = "RE Continental";
		String bike5 = "RE Interceptor";
		String bike6 = "Apache";
		String bike7 = "KTM";
		String bike8 = "Duke";
		String bike9 = "Ducati";
		String bike10 = "BMW";
		String bike11 = "RC 200";
		String bike12 = "Pulsar";
		String bike13 = "Tvs Jupiter";
		String bike14 = "Hero Splender";
		String bike15 = "Activa";
		String bike16 = "Dio";
		String bike17 = "N S 200";
		String bike18 = "R15";

		Collection<String> collection = new TreeSet<String>();
		collection.add(bike1);
		collection.add(bike2);
		collection.add(bike3);
		collection.add(bike4);
		collection.add(bike5);
		collection.add(bike6);
		collection.add(bike7);
		collection.add(bike8);
		collection.add(bike9);
		collection.add(bike10);
		collection.add(bike11);
		collection.add(bike12);
		collection.add(bike13);
		collection.add(bike14);
		collection.add(bike15);
		collection.add(bike16);
		collection.add(bike17);
		collection.add(bike18);
		//collection.add("Jawa");

		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}

}
