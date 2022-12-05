package com.xworkz.follower;

import com.xworkz.rules.KarnatakaRTO;

public class Shashank extends JavaTrainee implements KarnatakaRTO {

	public Shashank(String name, int age, double weight, String location, double height) {
		super(name, age, weight, location, height);
	}

	@Override
	public double vat() {
		System.out.println("Running vat");
		return 0;
	}

	@Override
	public boolean training() {
		System.out.println("Running training");
		return false;
	}

	@Override
	public boolean executeProgram() {
		System.out.println("Running Execute program");
		return false;
	}

}
