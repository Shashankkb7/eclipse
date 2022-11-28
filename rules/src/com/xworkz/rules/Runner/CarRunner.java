package com.xworkz.rules.Runner;

import com.xworkz.rules.Car;
import com.xworkz.rules.bridge.CarDriver;

public class CarRunner {

	public static void main(String[] args) {

		Car car = new CarDriver();
		car.carName();
		car.carNumber();
		car.carRent();
		car.carType();
		car.noOfWheelsInCar();
	}

}
