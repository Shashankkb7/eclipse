package com.xworkz.rules.Runner;

import com.xworkz.rules.RailwayStation;
import com.xworkz.rules.bridge.RailwayFollwer;

public class RailwayStationRunner {

	public static void main(String[] args) {

		RailwayStation railway = new RailwayFollwer();
		railway.buyTicket();
		railway.location();
		railway.noOfTrains();
		railway.passengers();
		railway.tc();
	}

}
