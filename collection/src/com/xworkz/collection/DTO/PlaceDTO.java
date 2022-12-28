package com.xworkz.collection.DTO;

import java.io.Serializable;

public class PlaceDTO implements Serializable {

	private String name;
	private Integer pincode;
	private String famousPlace;

	public PlaceDTO() {

	}

	public PlaceDTO(String name, Integer pincode, String famousPlace) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.famousPlace = famousPlace;
	}

	@Override
	public boolean equals(Object anything) {
		System.out.println("Running equals in PlaceDTO");
		{
			if (anything != null) {
				if (anything instanceof PlaceDTO) {
					PlaceDTO dto = (PlaceDTO) anything;
					if (dto.famousPlace.equals(this.famousPlace)) {
						System.out.println("Famous place " + famousPlace);
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", pincode=" + pincode + ", famousPlace=" + famousPlace + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getFamousPlace() {
		return famousPlace;
	}

	public void setFamousPlace(String famousPlace) {
		this.famousPlace = famousPlace;
	}

}
