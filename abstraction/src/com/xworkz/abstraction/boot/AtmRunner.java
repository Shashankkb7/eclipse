package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.child.SbiAtm;
import com.xworkz.abstraction.things.Atm;

public class AtmRunner {

	public static void main(String[] args) {

		Atm atm = new SbiAtm();
		atm.display();
		atm.withdraw();

	}

}
