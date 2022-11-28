package com.xworkz.rules.bridge;

import com.xworkz.rules.Airport;

public class Passengers implements Airport {

	@Override
	public String location() {
		System.out.println("Location");
		return null;
	}

	@Override
	public String name() {
		System.out.println("name");
		return null;
	}

	@Override
	public int noOfEmployees() {
		System.out.println("no of emplyoees");
		return 0;
	}

	@Override
	public int noOfFlights() {
		System.out.println("no of flights");
		return 0;
	}

	@Override
	public boolean parking() {
		System.out.println("parking");
		return true;
	}
}
