package com.xworkz.rules;

public abstract class Person {

	private String name;
	private int age;
	private double weight;
	private String location;
	private double height;

	public abstract boolean eat();

	public abstract boolean sleep();

	public Person(String name, int age, double weight, String location, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.location = location;
		this.height = height;
	}

	public void show() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.location);
		System.out.println(this.weight);
		System.out.println(this.height);

	}
}
