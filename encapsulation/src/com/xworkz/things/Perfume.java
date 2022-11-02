package com.xworkz.things;

public class Perfume {

	private String brand = "Wild stone";
	public String fragrance = "Eau de parfum";
	double price = 319;
	String mfd = "2/11/2022";
	String expd = "30/5/2024";
	String manufactureCountry = "India";
	char idealFor = 'M';
	int quantity = 50;
	int rating = 4;
	boolean quality = true;
	String color = "Pink";

	public String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	public void setFrgrance(String fragrance) {
		this.fragrance = fragrance;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setMfd(String mfd) {
		this.mfd = mfd;
	}

	void setExpd(String expd) {
		this.expd = expd;
	}

	void setManufactureCountry(String manufactureCountry) {
		this.manufactureCountry = manufactureCountry;
	}

	void setIdealFor(char idealFor) {
		this.idealFor = idealFor;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void setRating(int rating) {
		this.rating = rating;
	}

	void setQuality(boolean quality) {
		this.quality = quality;
	}

	void setColor(String color) {
		this.color = color;
	}

}
