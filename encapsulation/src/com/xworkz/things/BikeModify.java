package com.xworkz.things;

public class BikeModify {

	public void useBike(Bike bike) {
		System.out.println("accessing Bike name:" + bike.getName());
		bike.setName("Duke");
		System.out.println("accessing Bike color:" + bike.getColor());
		bike.setColor("black");
		System.out.println("accessing modfying bike name:" + bike.getName());
		System.out.println("accessing modfying Bike color:" + bike.getColor());
		System.out.println("bike model:" + bike.model);
		System.out.println("bike brand:" + bike.brand);
		System.out.println("bike mfd:" + bike.mfd);
		System.out.println("bike mileage:" + bike.mileage);
		System.out.println("bike no:" + bike.no);
		System.out.println("bike no Of Tyres:" + bike.noOfTyres);
		System.out.println("bike price:" + bike.price);
		System.out.println("bike weight In Kg:" + bike.weightInKg);
		System.out.println("bike fuel Tank Capacity:" + bike.fuelTankCapacity);
	}
}
