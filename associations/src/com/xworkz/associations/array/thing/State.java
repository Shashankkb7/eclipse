package com.xworkz.associations.array.thing;

public class State {

	public String name;
	public String cm;
	public int noOfDstricts;
	public String oldName;

	public State(String name, String cm, int noOfDstricts, String oldName) {
		super();
		this.name = name;
		this.cm = cm;
		this.noOfDstricts = noOfDstricts;
		this.oldName = oldName;
	}

	public void showOff() {
		System.out.println("state name:" + this.name);
		System.out.println("state cm:" + this.cm);
		System.out.println("state no of districts" + this.noOfDstricts);
		System.out.println("state old name:" + this.oldName);
	}

}
