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
		System.out.println(this.name);
		System.out.println(this.cm);
		System.out.println(this.noOfDstricts);
		System.out.println(this.oldName);
	}

}
