package com.xworkz.collection.DTO;

import java.io.Serializable;

public class CalenderDTO implements Serializable {

	private String name;
	private String language;
	private Double price;

	public CalenderDTO() {

	}

	public CalenderDTO(String name, String language, Double price) {
		super();
		this.name = name;
		this.language = language;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in CalenderDTO");
		{
			if (obj != null) {
				if (obj instanceof CalenderDTO) {
					CalenderDTO dto = (CalenderDTO) obj;
					if (dto.name.equals(this.name)) {
						System.out.println("name " + name);
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Calender [name=" + name + ", type=" + language + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
