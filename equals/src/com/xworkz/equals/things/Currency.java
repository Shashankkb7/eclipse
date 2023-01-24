package com.xworkz.equals.things;

public class Currency {

	private String type;
	private String color;
	private int amount;
	private boolean fake;
	private String country;
	private String acceptIn;
	private double depth;
	private boolean original;
	private double width;
	private double height;

	public Currency() {
		System.out.println("default const of currency");
	}

	public Currency(String type, String color, int amount, boolean fake, String country, String acceptIn, double depth,
			boolean original, double width, double height) {
		super();
		this.type = type;
		this.color = color;
		this.amount = amount;
		this.fake = fake;
		this.country = country;
		this.acceptIn = acceptIn;
		this.depth = depth;
		this.original = original;
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in currency");
		if (obj instanceof Currency) {
			System.out.println("other is currency,can check the properties");
			Currency cast3 = (Currency) obj;
			if (this.type.equals(cast3.type) && this.color.equals(cast3.color) && this.country.equals(cast3.country)
					&& this.acceptIn.equals(cast3.acceptIn)) {
				System.out.println("type,color,country and acceptIn are same");
				return true;
			} else {
				System.err.println("type,color,country and acceptIn are not same");
				return false;
			}
		} else {
			System.err.println("other is not currency cannot check the properties");
		}
		return false;

	}

	@Override
	public String toString() {
		return "Currency [type=" + type + ", color=" + color + ", amount=" + amount + ", fake=" + fake + ", country="
				+ country + ", acceptIn=" + acceptIn + ", depth=" + depth + ", original=" + original + ", width="
				+ width + ", height=" + height + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isFake() {
		return fake;
	}

	public void setFake(boolean fake) {
		this.fake = fake;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAcceptIn() {
		return acceptIn;
	}

	public void setAcceptIn(String acceptIn) {
		this.acceptIn = acceptIn;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public boolean isOriginal() {
		return original;
	}

	public void setOriginal(boolean original) {
		this.original = original;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
