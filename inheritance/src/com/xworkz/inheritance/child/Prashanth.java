package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Director;

public class Prashanth extends Director {

	public String famousMovie;

	public Prashanth(String name, int noOfMovies, String famousMovie) {
		super(name, noOfMovies);
		this.famousMovie = famousMovie;
	}

	public void display() {
		super.display();
		System.out.println(this.famousMovie);
	}
}
