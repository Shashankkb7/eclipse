package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Home;

public class Pg extends Home {

	@Override
	public void permanent() {
		super.permanent();
		System.out.println("Running permanent from Pg");
	}
}
