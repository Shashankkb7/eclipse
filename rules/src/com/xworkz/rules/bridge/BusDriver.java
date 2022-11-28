package com.xworkz.rules.bridge;

import com.xworkz.rules.Bus;

public class BusDriver implements Bus {

	@Override
	public String name() {
		System.out.println("Name");
		return null;
	}

	@Override
	public int noOfWheels() {
		System.out.println("No of Wheels");
		return 0;
	}

	@Override
	public String number() {
		System.out.println("Number");
		return null;
	}

	@Override
	public boolean rent() {
		System.out.println("rent");
		return false;
	}

	@Override
	public String type() {
		System.out.println("type");
		return null;
	}
}
