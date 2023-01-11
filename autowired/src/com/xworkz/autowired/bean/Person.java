package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	@Qualifier("personName")
	private String name;
	@Autowired
	@Qualifier("personShoeSize")
	private int shoeSize;
	@Autowired
	@Qualifier("personPantSize")
	private byte pantSize;
	@Autowired
	@Qualifier("personShirtSize")
	private short shirtSize;
	@Autowired
	@Qualifier("personPhNo")
	private long phoneNo;
	@Autowired
	@Qualifier("personHeight")
	private float height;
	@Autowired
	@Qualifier("personWeight")
	private double weight;
	@Autowired
	@Qualifier("personGender")
	private char gender;
	@Autowired
	@Qualifier("personIsAlive")
	private boolean alive;

	public Person() {
		System.out.println("Creating Person using default const by Spring");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", shoeSize=" + shoeSize + ", pantSize=" + pantSize + ", shirtSize=" + shirtSize
				+ ", phoneNo=" + phoneNo + ", height=" + height + ", weight=" + weight + ", gender=" + gender
				+ ", alive=" + alive + "]";
	}

}
