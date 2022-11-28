package com.xworkz.rules.Runner;

import com.xworkz.rules.MetroStation;
import com.xworkz.rules.bridge.MetroFollwer;

public class MetroRunner {

	public static void main(String[] args) {

		MetroStation metro = new MetroFollwer();
		metro.location();
		metro.name();
		metro.noOfWorkers();
		metro.since();
		metro.wearMask();
	}

}
