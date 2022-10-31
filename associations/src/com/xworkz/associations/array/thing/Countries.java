package com.xworkz.associations.array.thing;

public class Countries {

	public String name;
	public String pm;
	public String president;
	public int noOfStates;

	public Countries(String name, String pm, String president, int noOfStates) {
		super();
		this.name = name;
		this.pm = pm;
		this.president = president;
		this.noOfStates = noOfStates;
	}

	public void showOff() {
		System.out.println("country name:" + this.name);
		System.out.println("country pm:" + this.pm);
		System.out.println("country president:" + this.president);
		System.out.println("country no of states:" + this.noOfStates);
	}

}
