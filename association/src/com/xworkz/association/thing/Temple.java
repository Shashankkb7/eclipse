package com.xworkz.association.thing;

public class Temple {

	public String name;
	public String mainPriest;
	public int noOfVisitors;
	public int collectionPerDay;
	public God god = new God("Anjaneya", 'M', "power of wind", "Gada");

	public Temple(String name, String mainPriest, int noOfVisitors, int collectionPerDay) {
		super();
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitors = noOfVisitors;
		this.collectionPerDay = collectionPerDay;
	}

	public void bedkotidare(String name) {
		System.out.println("god atra bedkotidare");
		System.out.println("bedkotidare:" + name);
		if (god != null) {
			this.god.startPraying();
		} else {
			System.out.println("god is null");
		}
	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("mainpriest:" + this.mainPriest);
		System.out.println("no of visitors:" + this.noOfVisitors);
		System.out.println("collection PerDay:" + this.collectionPerDay);
		this.god.showOff();
	}

}
