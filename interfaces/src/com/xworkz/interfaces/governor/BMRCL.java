package com.xworkz.interfaces.governor;

import com.xworkz.interfaces.rules.MetroRules;

public class BMRCL {

	private MetroRules metro;

	public BMRCL() {
		System.out.println("Default const of BMRCL..");
	}

	public BMRCL(MetroRules metro) {
		super();
		this.metro = metro;
	}

	public void display() {
		System.out.println("Running ticket and social distancing..");
		if (this.metro != null) {
			boolean ticket = this.metro.ticket();
			boolean wear = this.metro.socialDistancing();
			if (ticket == true && wear == true) {
				System.out.println("Passengers is follow the rules..");
			} else {
				System.out.println("Passengers is not follow the rules");
			}
		}
	}

}
