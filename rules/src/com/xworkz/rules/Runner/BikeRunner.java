package com.xworkz.rules.Runner;

import com.xworkz.rules.Bike;
import com.xworkz.rules.bridge.BikeDriver;

public class BikeRunner {

	public static void main(String[] args) {

		Bike bike = new BikeDriver();
		bike.bikeName();
		bike.bikeNumber();
		bike.bikeRent();
		bike.bikeType();
		bike.noOfWheelsInBike();
	}

}
