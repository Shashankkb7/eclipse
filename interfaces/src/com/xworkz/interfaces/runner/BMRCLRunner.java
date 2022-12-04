package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.follower.Passengers;
import com.xworkz.interfaces.governor.BMRCL;
import com.xworkz.interfaces.rules.MetroRules;

public class BMRCLRunner {

	public static void main(String[] args) {

		MetroRules metro = new Passengers();
		BMRCL bmrcl = new BMRCL(metro);
		bmrcl.display();
	}

}
