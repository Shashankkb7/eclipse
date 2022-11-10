package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.PetrolBunk;

public class Venkateshwara extends PetrolBunk {

	@Override
	public void petrolHaktare() {
		super.petrolHaktare();
		System.out.println("Running petrol Haktare from venkateshwara");
	}
}
