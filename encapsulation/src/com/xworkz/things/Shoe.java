package com.xworkz.things;

public class Shoe {

	private String name = "Puma";
	String type = "Shoes";
	int price = 1919;
	int size = 8;
	String color = "Pink";
	char idealFor = 'F';
	String occasion = "Sports";
	String tipShape = "Round";
	String closure = "Slip on";
	int packOf = 1;
	String countryOrigin = "India";

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	void setType(String type) {
		this.type = type;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setSize(int size) {
		this.size = size;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setIdealFor(char idealFor) {
		this.idealFor = idealFor;
	}

	void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	void setClosure(String closure) {
		this.closure = closure;
	}

	void setPackOf(int packOf) {
		this.packOf = packOf;
	}

	void setTipShape(String tipShape) {
		this.tipShape = tipShape;
	}

}
