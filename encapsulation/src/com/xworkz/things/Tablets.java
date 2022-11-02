package com.xworkz.things;

public class Tablets {

	private String name = "Dolo 650";
	private int price = 26;
	String countryofOrigin = "India";
	String manufacturedBy = "Micro labs limited";
	String mfDate = "02/11/2022";
	String expDate = "11/02/2024";
	boolean paracetamol = true;
	String asinNumber = "B084BDR9GB";
	boolean forChildren = false;
	int weight = 15;
	int netQuantity = 15;

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	void setName(String name) {
		this.name = name;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setCountryofOrigin(String countryofOrigin) {
		this.countryofOrigin = countryofOrigin;
	}

	void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	void setParacetamol(boolean paracetamol) {
		this.paracetamol = paracetamol;
	}

	void setForChildren(boolean forChildren) {
		this.forChildren = forChildren;
	}

	void setNetQuantity(int netQuantity) {
		this.netQuantity = netQuantity;
	}

	void setAsinNumber(String asinNumber) {
		this.asinNumber = asinNumber;
	}

	void setMfDate(String mfDate) {
		this.mfDate = mfDate;
	}

	void setweight(int weight) {
		this.weight = weight;
	}

	void setExpDate(String expDate) {
		this.expDate = expDate;
	}

}
