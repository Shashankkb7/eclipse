package com.xworkz.rules.bridge;

import com.xworkz.rules.College;

public class Students implements College {

	@Override
	public String location() {
		System.out.println("Location");
		return null;
	}

	@Override
	public String name() {
		System.out.println("Name");
		return null;
	}

	@Override
	public int since() {
		System.out.println("since");
		return 0;
	}

	@Override
	public String type() {
		System.out.println("type");
		return null;
	}

	@Override
	public boolean wearIdCard() {
		System.out.println("wear id card");
		return true;
	}

}
