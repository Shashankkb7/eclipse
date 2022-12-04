package com.xworkz.interfaces.follower;

import com.xworkz.interfaces.rules.AirportRules;

public class Staff implements AirportRules {

	@Override
	public boolean luggageChecking() {
		System.out.println("Running luggage checking...");
		return true;
	}

	@Override
	public int ageLimit() {
		System.out.println("Running age limit...");
		return 2;
	}

}
