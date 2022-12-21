package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSizeRunner {

	public static void main(String[] args) {

		double size1 = 5;
		double size2 = 6;
		double size3 = 6.5;
		double size4 = 7;
		double size5 = 7.5;
		double size6 = 8;
		double size7 = 8.5;
		double size8 = 9;
		double size9 = 9.5;
		double size10 = 10;
		double size11 = 10.5;
		double size12 = 11;
		double size13 = 11.5;
		double size14 = 12;
		double size15 = 12.5;

		Collection<Double> sizes = new ArrayList<Double>();
		sizes.add(size1);
		sizes.add(size2);
		sizes.add(size3);
		sizes.add(size4);
		sizes.add(size5);
		sizes.add(size6);
		sizes.add(size7);
		sizes.add(size8);
		sizes.add(size9);
		sizes.add(size10);
		sizes.add(size11);
		sizes.add(size12);
		sizes.add(size13);
		sizes.add(size14);
		sizes.add(size15);

		for (Double ref : sizes) {
			System.out.println(ref);
		}

		System.out.println("======Iterator======");

		Iterator<Double> iterator = sizes.iterator();
		while (iterator.hasNext()) {
			Double element = iterator.next();
			System.out.println(element);
		}
	}

}
