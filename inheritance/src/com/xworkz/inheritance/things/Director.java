package com.xworkz.inheritance.things;

public class Director {

	public String name;
	public int noOfMovies;

	public Director(String name, int noOfMovies) {
		super();
		this.name = name;
		this.noOfMovies = noOfMovies;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.noOfMovies);
	}
}
