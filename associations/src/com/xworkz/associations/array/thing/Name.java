package com.xworkz.associations.array.thing;

public class Name {

	public String oldName;
	public String newName;
	public String futureName;

	public Name(String oldName, String newName, String futureName) {
		this.oldName = oldName;
		this.newName = newName;
		this.futureName = futureName;
	}

	public void showOff() {
		System.out.println(this.oldName);
		System.out.println(this.newName);
		System.out.println(this.futureName);
	}

}
