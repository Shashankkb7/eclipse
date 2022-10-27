package com.xworkz.association.thing;

public class God {

	public String name;
	public char gender;
	public String mainPower;
	public String weapon;

	public God(String name, char gender, String mainPower, String weapon) {
		super();
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
		this.weapon = weapon;
	}

	public void startPraying() {
		System.out.println("invoking start Praying");
	}

	public void stopPraying() {
		System.out.println("invoking stop Praying");

	}

	public void showOff() {
		System.out.println("god name:" + this.name);
		System.out.println("god gender:" + this.gender);
		System.out.println("god mainPower:" + this.mainPower);
		System.out.println("god weapon:" + this.weapon);
	}

}
