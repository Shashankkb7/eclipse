package com.xworkz.rules.bridge;

import com.xworkz.rules.RailwayStation;

public class RailwayFollwer implements RailwayStation {

	@Override
	public boolean buyTicket() {
		System.out.println("Buy ticket");
		return true;
	}

	@Override
	public String location() {
		System.out.println("location");
		return null;
	}

	@Override
	public int noOfTrains() {
		System.out.println("no of trains");
		return 0;
	}

	@Override
	public boolean passengers() {
		System.out.println("passengers");
		return true;
	}

	@Override
	public boolean tc() {
		System.out.println("tc");
		return true;
	}

}
