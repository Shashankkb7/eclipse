package com.xworkz.rules.Runner;

import com.xworkz.rules.Bus;
import com.xworkz.rules.bridge.BusDriver;

public class BusRunner {

	public static void main(String[] args) {

		Bus bus = new BusDriver();
		bus.name();
		bus.noOfWheels();
		bus.number();
		bus.rent();
		bus.type();
	}

}
