package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Terrorist;

public class Kasab extends Terrorist {

	@Override
	public void bombHaktare() {
		super.bombHaktare();
		System.out.println("Running bomb haktare from kasab");
	}
}
