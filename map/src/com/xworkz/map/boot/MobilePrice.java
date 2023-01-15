package com.xworkz.map.boot;

import java.util.Map;
import java.util.TreeMap;

public class MobilePrice {

	public static void main(String[] args) {

		Map<String, Double> mobilePrice = new TreeMap<String, Double>((key1, value1) -> value1.compareTo(key1));
		mobilePrice.put("Iphone", 180000d);
		mobilePrice.put("Redmi", 14000d);
		mobilePrice.put("Realme", 15000d);
		mobilePrice.put("Nokia", 10000d);
		mobilePrice.put("Oppo", 12000d);
		mobilePrice.put("Vivo", 22000d);
		mobilePrice.put("Pixel", 52000d);
		mobilePrice.put("OnePlus", 60000d);
		mobilePrice.put("Poco", 20000d);
		mobilePrice.put("Moto", 13000d);

		System.out.println("Printing all key values in capital letters");
		mobilePrice.forEach((k, v) -> System.out.println("Mobile :" + k.toUpperCase() + " Price :" + v));

		System.out.println(System.lineSeparator());
		System.out.println("Printing all entries if price is greater than 50000");
		mobilePrice.forEach((k, v) -> {
			if (v > 50000d) {
				System.out.println("Mobile :" + k + " Price :" + v);
			}
		});

		System.out.println(System.lineSeparator());
		System.out.println("Printing all entries k is less than 5 characters");
		mobilePrice.forEach((k, v) -> {
			if (k.length() < 5) {
				System.out.println("Mobile :" + k + " Price :" + v);
			}
		});
		System.out.println(System.lineSeparator());

		System.out.println("Printing all entries in descending order");
		mobilePrice.forEach((k, v) -> System.out.println("Mobile :" + k + " Price :" + v));
	}
}
