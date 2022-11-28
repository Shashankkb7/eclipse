package com.xworkz.rules.Runner;

import com.xworkz.rules.Traffic;
import com.xworkz.rules.bridge.Citizens;

public class TrafficRunner {

	public static void main(String[] args) {
		Traffic traffic = new Citizens();
		traffic.followSignals();
		traffic.location();
		traffic.tripleRiding();
		traffic.wearHelmet();
		traffic.wearMask();
	}

}
