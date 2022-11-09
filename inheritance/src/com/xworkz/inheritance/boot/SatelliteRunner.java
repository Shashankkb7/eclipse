package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Moon;

public class SatelliteRunner {

	public static void main(String[] args) {

		Moon moon = new Moon("Moon", 4550, 384400);
		moon.display();
	}
}
