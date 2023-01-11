package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("pencilType")
	private String type;
	@Autowired
	@Qualifier("pencilPrice")
	private double price;
	@Autowired
	@Qualifier("pencilColor")
	private String color;
	@Autowired
	@Qualifier("pencilIsSharp")
	private boolean sharp;
	@Autowired
	@Qualifier("pencilIsStolen")
	private boolean stolen;

	public Pencil() {
		System.out.println("Creating Pencil using default const by Spring");
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}

}
