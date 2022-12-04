package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.follower.Staff;
import com.xworkz.interfaces.governor.AirportAuthority;
import com.xworkz.interfaces.rules.AirportRules;

public class AirportAuthorityRunner {

	public static void main(String[] args) {

		AirportRules airport = new Staff();
		AirportAuthority authority = new AirportAuthority(airport);
		authority.departure();
	}

}
