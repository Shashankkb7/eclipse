package com.xworkz.equals.things;

public class Lipstick {

	private String name;
	private String texture;
	private String form;
	private String finish;
	private String color;
	private String countryOrigin;
	private String genericName;
	private String quantity;
	private double price;
	private int duration;

	public Lipstick() {
		System.out.println("default const of lipstick");
	}

	public Lipstick(String name, String texture, String form, String finish, String color, String countryOrigin,
			String genericName, String quantity, double price, int duration) {
		super();
		this.name = name;
		this.texture = texture;
		this.form = form;
		this.finish = finish;
		this.color = color;
		this.countryOrigin = countryOrigin;
		this.genericName = genericName;
		this.quantity = quantity;
		this.price = price;
		this.duration = duration;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in Lipstick");
		if (obj instanceof Hospital) {
			System.out.println("other is Lipstick,can check the properties");
			Lipstick cast6 = (Lipstick) obj;
			if (this.name.equals(cast6.name) && this.texture.equals(cast6.texture) && this.form.equals(cast6.form)
					&& this.finish.equals(cast6.finish) && this.color.equals(cast6.color)
					&& this.countryOrigin.equals(cast6.countryOrigin) && this.genericName.equals(cast6.genericName)
					&& this.quantity.equals(cast6.quantity)) {
				System.out.println("name,texture,form,finish,color,countryOrigin,genericName,quantity are same");
				return true;
			} else {
				System.err.println("name,texture,form,finish,color,countryOrigin,genericName,quantity are not same");
				return false;
			}
		} else {
			System.err.println("other is not Lipstick cannot check the properties");
		}
		return false;

	}

	@Override
	public String toString() {
		return "Lipstick [name=" + name + ", texture=" + texture + ", form=" + form + ", finish=" + finish + ", color="
				+ color + ", countryOrigin=" + countryOrigin + ", genericName=" + genericName + ", quantity=" + quantity
				+ ", price=" + price + ", duration=" + duration + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
