package com.xworkz.other;

import com.xworkz.boot.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lamp lamp = new Lamp("Table Lamp");
		lamp.setPrice(640);
		lamp.countryOfOrigin = "China";
		lamp.display();
	}

}
