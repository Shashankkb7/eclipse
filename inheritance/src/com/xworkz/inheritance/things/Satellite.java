package com.xworkz.inheritance.things;

public class Satellite {

	public String name;
	public int noOfSatellites;

	public Satellite(String name, int noOfSatellites) {
		super();
		this.name = name;
		this.noOfSatellites = noOfSatellites;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.noOfSatellites);
	}
}
