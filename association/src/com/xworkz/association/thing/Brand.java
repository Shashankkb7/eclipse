package com.xworkz.association.thing;

public class Brand {

	public String name;
	public long gstNo;
	public String location;
	public int rating;

	public Brand(String name, long gstNo, String location, int rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.location = location;
		this.rating = rating;
	}

	public void petrolStart() {
		System.out.println("invoking start fuel");
	}

	public void petrolStop() {
		System.out.println("invoking stop fuel");

	}

	public void showOff() {
		System.out.println("Brand name:" + this.name);
		System.out.println("Brand gstNo:" + this.gstNo);
		System.out.println("Brand location:" + this.location);
		System.out.println("Brand rating:" + this.rating);
	}

}
