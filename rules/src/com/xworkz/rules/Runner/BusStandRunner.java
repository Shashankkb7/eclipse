package com.xworkz.rules.Runner;

import com.xworkz.rules.BusStand;
import com.xworkz.rules.bridge.BusStandFollower;

public class BusStandRunner {

	public static void main(String[] args) {

		BusStand stand = new BusStandFollower();
		stand.govtBus();
		stand.location();
		stand.name();
		stand.noOfBus();
		stand.privateBus();
	}

}
