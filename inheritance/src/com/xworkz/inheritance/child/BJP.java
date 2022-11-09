package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.PoliticalParty;

public class BJP extends PoliticalParty {

	public int since;

	public BJP(String partyName, int noOfMembers, int since) {
		super(partyName, noOfMembers);
		this.since = since;
	}

	public void display() {
		super.display();
		System.out.println(this.since);
	}

}
