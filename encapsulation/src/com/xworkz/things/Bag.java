package com.xworkz.things;

public class Bag {

	private String brand = "Wild craft";
	private String type = "Laptop back pack";
	String color = "Brown";
	String colorCode = "Chocolate";
	String material = "Artificial leather";
	int price = 2999;
	boolean trolleySupport = false;
	String idealFor = "Men and women";
	boolean laptopSleeve = true;
	int noOfCompartments = 2;
	boolean rainCover = false;

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setType(String type) {
		this.type = type;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	void setMaterial(String material) {
		this.material = material;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setNoOfCompartments(int noOfCompartments) {
		this.noOfCompartments = noOfCompartments;
	}

	void setLaptopSleeve(boolean laptopSleeve) {
		this.laptopSleeve = laptopSleeve;
	}

	void setRainCover(boolean rainCover) {
		this.rainCover = rainCover;
	}

	void setTrolleySupport(boolean trolleySupport) {
		this.trolleySupport = trolleySupport;
	}

	void setIdealFor(String idealFor) {
		this.idealFor = idealFor;
	}
}
