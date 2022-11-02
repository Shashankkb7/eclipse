package com.xworkz.things;

public class Wallet {

	private String name = "Wild Horn";
	boolean quality = true;
	int price = 499;
	int cardSlots = 9;
	String color = "Black";
	String discount = "5%";
	String size = "Regular";
	String material = "Genuine leather";
	String idealFor = "Men";
	int height = 12;
	String countryOrigin = "India";

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	void setQuality(boolean quality) {
		this.quality = quality;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setMaterial(String material) {
		this.material = material;
	}

	void setSize(String size) {
		this.size = size;
	}

	void setDiscount(String discount) {
		this.discount = discount;
	}

	void setIdealFor(String idealFor) {
		this.idealFor = idealFor;
	}

	void setHeight(int height) {
		this.height = height;
	}

	void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
}
