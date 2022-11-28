package com.xworkz.rules.bridge;

import com.xworkz.rules.BusStand;

public class BusStandFollower implements BusStand {

	@Override
	public boolean govtBus() {
		System.out.println("Govt bus");
		return true;
	}

	@Override
	public String location() {
		System.out.println("Location");
		return null;
	}

	@Override
	public String name() {
		System.out.println("Busstand name");
		return null;
	}

	@Override
	public int noOfBus() {
		System.out.println("No of bus");
		return 0;
	}

	@Override
	public boolean privateBus() {
		System.out.println("Private bus");
		return false;
	}

}
