package com.xworkz.association.thing;

import com.xworkz.association.constants.PillarShape;

public class Pillar {

	public int id;
	public String place;
	public PillarShape shape = PillarShape.RECTANGLE;
	public Company company = new Company("Shobha", "Construction company");

	public Pillar(int id, String place, PillarShape shape) {
		super();
		this.id = id;
		this.place = place;
		this.shape = shape;
	}

	public void constructing(String name) {
		System.out.println("running construction");
		System.out.println("constructing:" + name);
		if (company != null) {
			this.company.startCompany();
		} else {
			System.out.println("company is null");
		}
	}

	public void display() {
		System.out.println("id:" + this.id);
		System.out.println("Place:" + this.place);
		System.out.println("Shape:" + this.shape);
		this.company.showOff();
	}

}
