package com.xworkz.abstraction.child;

import com.xworkz.abstraction.things.Atm;

public class SbiAtm extends Atm {

	@Override
	public void withdraw() {
		System.out.println("implementation method");
	}

}
