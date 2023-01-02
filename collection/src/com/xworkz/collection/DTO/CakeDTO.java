package com.xworkz.collection.DTO;

import java.io.Serializable;

public class CakeDTO implements Serializable {

	private String name;
	private double price;
	private String color;

	public CakeDTO() {

	}

	public CakeDTO(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	@Override
	public int hashCode() {
		System.out.println("Running hashcode");
		return 100;
	}

	@Override
	public String toString() {
		return "CakeDTO [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals");
		{
			if (obj != null) {
				if (obj instanceof CakeDTO) {
					CakeDTO dto = (CakeDTO) obj;
					{
						if (dto.name.equals(this.name) && dto.price == this.price) {
							System.out.println("dto " + dto);
							return true;
						}
					}

				}
			}
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
