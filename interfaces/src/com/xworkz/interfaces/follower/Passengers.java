package com.xworkz.interfaces.follower;

import com.xworkz.interfaces.rules.MetroRules;

public class Passengers implements MetroRules {

	@Override
	public boolean ticket() {
		System.out.println("Running ticket...");
		return true;
	}

	@Override
	public boolean socialDistancing() {
		System.out.println("Running socialDistancing...");
		return true;
	}
}
