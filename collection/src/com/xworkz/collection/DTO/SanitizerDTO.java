package com.xworkz.collection.DTO;

import java.io.Serializable;

public class SanitizerDTO implements Serializable {

	private int id;
	private String brand;
	private String color;
	private double price;

	public SanitizerDTO() {

	}

	public SanitizerDTO(int id, String brand, String color, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
