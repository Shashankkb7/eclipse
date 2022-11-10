package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.HumanResource;

public class Akshara extends HumanResource {

	@Override
	public void hire() {
		super.hire();
		System.out.println("Running hire from akshara");
	}
}
