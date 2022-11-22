package com.xworkz.equals.things;

public class WaterBottle {

	private String brand;
	private String color;
	private double price;
	private int capacity;
	private String material;
	private String model;
	private String genericName;
	private String countryOfOrigin;
	private boolean quality;
	private boolean design;

	public WaterBottle() {
		System.out.println("Default const of water bottle");
	}

	public WaterBottle(String brand, String color, double price, int capacity, String material, String model,
			String genericName, String countryOfOrigin, boolean quality, boolean design) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.capacity = capacity;
		this.material = material;
		this.model = model;
		this.genericName = genericName;
		this.countryOfOrigin = countryOfOrigin;
		this.quality = quality;
		this.design = design;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in bottle");
		if (obj instanceof WaterBottle) {
			System.out.println("other is bottle,can check the properties");
			WaterBottle cast2 = (WaterBottle) obj;
			if (this.brand.equals(cast2.brand) && this.color.equals(cast2.color)
					&& this.countryOfOrigin.equals(cast2.countryOfOrigin)) {
				System.out.println("brand,color and countryOfOrigin are same");
				return true;
			} else {
				System.err.println("brand,color and countryOfOrigin are not same");
				return false;
			}
		} else {
			System.err.println("other is not bottle cannot check the properties");
		}
		return false;

	}

	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", color=" + color + ", price=" + price + ", capacity=" + capacity
				+ ", material=" + material + ", model=" + model + ", genericName=" + genericName + ", countryOfOrigin="
				+ countryOfOrigin + ", quality=" + quality + ", design=" + design + "]";
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isDesign() {
		return design;
	}

	public void setDesign(boolean design) {
		this.design = design;
	}

}
