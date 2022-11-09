package com.xworkz.inheritance.things;

public class PoliticalParty {

	public String partyName;
	public int noOfMembers;

	public PoliticalParty(String partyName, int noOfMembers) {
		super();
		this.partyName = partyName;
		this.noOfMembers = noOfMembers;
	}

	public void display() {
		System.out.println(this.partyName);
		System.out.println(this.noOfMembers);
	}
}
