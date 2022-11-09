package com.xworkz.inheritance.things;

public class Criminal {

	public String name;
	public int noOfCrimes;

	public Criminal(String name, int noOfCrimes) {
		super();
		this.name = name;
		this.noOfCrimes = noOfCrimes;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.noOfCrimes);
	}

}
