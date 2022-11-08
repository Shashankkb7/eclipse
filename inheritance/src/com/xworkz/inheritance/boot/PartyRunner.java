package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.BachelorParty;
import com.xworkz.inheritance.things.Party;

public class PartyRunner {

	public static void main(String[] args) {

		Party party = new BachelorParty("Marriage", "Vijaynagar", 12);
		System.out.println("Party details");
		System.out.println(party.type);
		System.out.println(party.location);
		System.out.println(party.noOfMembers);
	}

}
