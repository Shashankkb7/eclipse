package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.WarJet;

public class Rafell extends WarJet {

	public void fire() {
		super.fire();
		System.out.println("Running fire from Rafell");
	}
}
