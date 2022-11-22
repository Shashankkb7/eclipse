package com.xworkz.equals.things;

public class Vehicle {

	private String name;
	private String color;
	private String brand;
	private String no;
	private double price;
	private String model;
	private double mileage;
	private int noOfTyres;
	private double fuelTankCapacity;
	private int weightInKg;

	public Vehicle() {
		System.out.println("Default const of vehicle");
	}

	public Vehicle(String name, String color, String brand, String no, double price, String model, double mileage,
			int noOfTyres, double fuelTankCapacity, int weightInKg) {
		super();
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.no = no;
		this.price = price;
		this.model = model;
		this.mileage = mileage;
		this.noOfTyres = noOfTyres;
		this.fuelTankCapacity = fuelTankCapacity;
		this.weightInKg = weightInKg;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in vehicle");
		if (other instanceof Vehicle) {
			System.out.println("other is vehicle,can check the properties");
			Vehicle cast1 = (Vehicle) other;
			if (this.brand.equals(cast1.brand) && this.color.equals(cast1.color)) {
				System.out.println("brand and color are same");
				return true;
			} else {
				System.err.println("brand and color are not same");
				return false;
			}
		} else {
			System.err.println("other is not vehicle cannot check the properties");
		}
		return false;

	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", color=" + color + ", brand=" + brand + ", no=" + no + ", price=" + price
				+ ", model=" + model + ", mileage=" + mileage + ", noOfTyres=" + noOfTyres + ", fuelTankCapacity="
				+ fuelTankCapacity + ", weightInKg=" + weightInKg + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public int getNoOfTyres() {
		return noOfTyres;
	}

	public void setNoOfTyres(int noOfTyres) {
		this.noOfTyres = noOfTyres;
	}

	public double getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	public void setFuelTankCapacity(double fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}

	public int getWeightInKg() {
		return weightInKg;
	}

	public void setWeightInKg(int weightInKg) {
		this.weightInKg = weightInKg;
	}

}
