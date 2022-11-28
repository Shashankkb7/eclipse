package com.xworkz.rules.bridge;

import com.xworkz.rules.MetroStation;

public class MetroFollwer implements MetroStation {

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
	public int noOfWorkers() {
		System.out.println("no of workers");
		return 0;
	}

	@Override
	public int since() {
		System.out.println("since");
		return 0;
	}

	@Override
	public boolean wearMask() {
		System.out.println("wear mask");
		return true;
	}

}
