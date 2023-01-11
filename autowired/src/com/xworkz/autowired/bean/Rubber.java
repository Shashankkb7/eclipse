package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubberType")
	private String type;
	@Autowired
	@Qualifier("rubberPrice")
	private double price;
	@Autowired
	@Qualifier("rubberColor")
	private String color;
	@Autowired
	@Qualifier("rubberIsSharp")
	private boolean sharp;
	@Autowired
	@Qualifier("rubberIsStolen")
	private boolean stolen;
	@Autowired
	@Qualifier("rubberSize")
	private double size;

	public Rubber() {
		System.out.println("Creating Rubber using default const by Spring");
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
}
