package com.xworkz.boot;

import com.xworkz.things.Bike;
import com.xworkz.things.BikeModify;

public class BikeRunner {

	public static void main(String[] args) {

		Bike bike = new Bike();
		System.out.println(bike.getName());
		System.out.println(bike.getColor());
		BikeModify modify = new BikeModify();
		modify.useBike(bike);

	}
	
}
