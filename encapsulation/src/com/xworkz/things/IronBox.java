package com.xworkz.things;

public class IronBox {

	private String brand = "Morphy Richard";
	private String type = "Steam";
	String color = "Blue";
	boolean temperatureControl = true;
	boolean indicatorLight = true;
	boolean selfCleaning = true;
	boolean steamBurst = true;
	boolean automaticShutOff = true;
	int waterTankCapacity = 350;
	double height = 15.8;
	double weight = 1.2;

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

	void setTemperatureControl(boolean temperatureControl) {
		this.temperatureControl = temperatureControl;
	}

	void setIndicatorLight(boolean indicatorLight) {
		this.indicatorLight = indicatorLight;
	}

	void setSelfCleaning(boolean selfCleaning) {
		this.selfCleaning = selfCleaning;
	}

	void setSteamBurst(boolean steamBurst) {
		this.steamBurst = steamBurst;
	}

	void setAutomaticShutOff(boolean automaticShutOff) {
		this.automaticShutOff = automaticShutOff;
	}

	void setWaterTankCapacity(int waterTankCapacity) {
		this.waterTankCapacity = waterTankCapacity;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	void setHeight(double height) {
		this.height = height;
	}

}
