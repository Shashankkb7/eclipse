package com.xworkz.associations.array.thing;

public class Company {

	public String name;
	public String ownerName;
	public Address address;

	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void showOff() {
		System.out.println("company name:" + this.name);
		System.out.println("company ownerName:" + this.ownerName);
		if (address != null) {
			System.out.println("address is printing:" + this.address);
			this.address.showOff();
		}
	}
}
