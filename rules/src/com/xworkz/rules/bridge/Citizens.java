package com.xworkz.rules.bridge;

import com.xworkz.rules.Traffic;

public class Citizens implements Traffic {

	@Override
	public boolean followSignals() {
		System.out.println("Follow signals");
		return true;
	}

	@Override
	public String location() {
		System.out.println("location");
		return null;
	}

	@Override
	public boolean tripleRiding() {
		System.out.println("triple riding");
		return false;
	}

	@Override
	public boolean wearHelmet() {
		System.out.println("Wear helmet");
		return true;
	}

	@Override
	public boolean wearMask() {
		System.out.println("Wear mask");
		return true;
	}

}
