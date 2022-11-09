package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Satellite;

public class Moon extends Satellite {

	public long distance;

	public Moon(String name, int noOfSatellites, long distance) {
		super(name, noOfSatellites);
		this.distance = distance;
	}

	public void display() {
		super.display();
		System.out.println(this.distance);
	}
}
