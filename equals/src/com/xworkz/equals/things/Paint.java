package com.xworkz.equals.things;

public class Paint {

	private String brand;
	private double price;
	private String type;
	private String features;
	private String finish;
	private boolean washable;
	private int quantity;
	private String color;
	private String applicationType;
	private String modelNumber;

	public Paint() {
		System.out.println("Default const of paint");
	}

	public Paint(String brand, double price, String type, String features, String finish, boolean washable,
			int quantity, String color, String applicationType, String modelNumber) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.features = features;
		this.finish = finish;
		this.washable = washable;
		this.quantity = quantity;
		this.color = color;
		this.applicationType = applicationType;
		this.modelNumber = modelNumber;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in paint");
		if (other instanceof Paint) {
			System.out.println("other is paint,can check the properties");
			Paint cast = (Paint) other;
			if (this.brand.equals(cast.brand)) {
				System.out.println("Brand is same");
				return true;
			}
		} else {
			System.err.println("other is not paint cannot check the properties");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", price=" + price + ", type=" + type + ", features=" + features + ", finish="
				+ finish + ", washable=" + washable + ", quantity=" + quantity + ", color=" + color
				+ ", applicationType=" + applicationType + ", modelNumber=" + modelNumber + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public boolean isWashable() {
		return washable;
	}

	public void setWashable(boolean washable) {
		this.washable = washable;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

}
