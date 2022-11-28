package com.xworkz.rules.bridge;

import com.xworkz.rules.Bike;

public class BikeDriver implements Bike {

	@Override
	public String bikeName() {
		System.out.println("Name");
		return null;
	}

	@Override
	public int noOfWheelsInBike() {
		System.out.println("No of wheels");
		return 0;
	}

	@Override
	public String bikeNumber() {
		System.out.println("number");
		return null;
	}

	@Override
	public boolean bikeRent() {
		System.out.println("rent");
		return false;
	}

	@Override
	public String bikeType() {
		System.out.println("type");
		return null;
	}

}
