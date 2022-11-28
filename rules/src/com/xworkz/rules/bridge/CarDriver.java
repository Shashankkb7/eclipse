package com.xworkz.rules.bridge;

import com.xworkz.rules.Car;

public class CarDriver implements Car {

	@Override
	public String carName() {
		System.out.println("Car name");
		return null;
	}

	@Override
	public String carNumber() {
		System.out.println("Car number");
		return null;
	}

	@Override
	public boolean carRent() {
		System.out.println("Car rent");
		return false;
	}

	@Override
	public String carType() {
		System.out.println("Car type");
		return null;
	}

	@Override
	public int noOfWheelsInCar() {
		System.out.println("No of wheels");
		return 0;
	}

}
