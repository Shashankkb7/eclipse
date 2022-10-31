package com.xworkz.associations.array.thing;

public class Cities {

	public String name;
	public String famousFor;
	public String oldName;
	public double areaInKm;

	public Cities(String name, String famousFor, String oldName, double areaInKm) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.oldName = oldName;
		this.areaInKm = areaInKm;
	}

	public void showOff() {
		System.out.println("city name:" + this.name);
		System.out.println("city famousFor:" + this.famousFor);
		System.out.println("city oldName:" + this.oldName);
		System.out.println("city areaInKm:" + this.areaInKm);
	}
}
