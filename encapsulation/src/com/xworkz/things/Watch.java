package com.xworkz.things;

public class Watch {

	private String brand = "Boat";
	private String type = "Touch screen";
	String color = "Black";
	String dialShape = "Circle";
	String modelNumber = "A1952";
	String strapMaterial = "Silicone";
	boolean waterResistant = true;
	String idealFor = "Men and women";
	boolean compatibleToIos = true;
	int batteryLife = 14;
	boolean callFunction = true;

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

	void setCompatibleToIos(boolean compatibleToIos) {
		this.compatibleToIos = compatibleToIos;
	}

	void setIndicatorLight(boolean waterResistant) {
		this.waterResistant = waterResistant;
	}

	void setSelfCleaning(boolean callFunction) {
		this.callFunction = callFunction;
	}

	void setStrapMaterial(String strapMaterial) {
		this.strapMaterial = strapMaterial;
	}

	void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	void setWaterTankCapacity(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	void setDialShape(String dialShape) {
		this.dialShape = dialShape;
	}

	void setIdealFor(String idealFor) {
		this.idealFor = idealFor;
	}
}
