package com.xworkz.interfaces.governor;

import com.xworkz.interfaces.rules.AirportRules;

public class AirportAuthority {

	private AirportRules airport;

	public AirportAuthority() {
		System.out.println("Default const of AirportAuthority...");
	}

	public AirportAuthority(AirportRules airport) {
		super();
		this.airport = airport;
	}

	public void departure() {
		System.out.println("Running checking luggage and age limit...");
		if (this.airport != null) {
			boolean check = this.airport.luggageChecking();
			int age = this.airport.ageLimit();
			{
				if (check == true && age == 2) {
					System.out.println("Staff follow the rules...");
				} else
					System.out.println("Staff not follow the rules...");
			}

		}
	}
}
