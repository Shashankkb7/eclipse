package com.xworkz.things;

public class Shirt {

	private String name = "Peter England";
	private String type = "Shirt";
	int price = 2000;
	int size = 36;
	String color = "Black";
	char idealFor = 'M';
	String occasion = "Party";
	String CollarType = "Spread";
	String closure = "Buttoned";
	int packOf = 1;
	String countryOrigin = "India";

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
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

	void setCollarType(String CollarType) {
		this.CollarType = CollarType;
	}

	void setPackOf(int packOf) {
		this.packOf = packOf;
	}

	void setClosure(String closure) {
		this.closure = closure;
	}
}
