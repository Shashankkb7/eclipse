package com.xworkz.things;

public class Bike {

	private String name = "Himalyan";
	private String color = "grey";
	String brand = "Royal Enfield";
	String no = "KA 16 ES 7438";
	int mfd = 2021;
	double price = 283600;
	String model = "BSVI";
	double mileage = 30;
	int noOfTyres = 2;
	double fuelTankCapacity = 16;
	int weightInKg = 200;

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	 void setBrand(String brand) {
		this.brand = brand;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setMfd(int mfd) {
		this.mfd = mfd;
	}

	void setNo(String no) {
		this.no = no;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setNoOfTyres(char noOfTyres) {
		this.noOfTyres = noOfTyres;
	}

	void setMileage(int mileage) {
		this.mileage = mileage;
	}

	void setFuelTankCapacity(double fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}

	void setWeightInKg(int weightInKg) {
		this.weightInKg = weightInKg;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setName(String name) {
		this.name = name;
	}
}
