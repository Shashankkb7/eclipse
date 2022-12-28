package com.xworkz.collection.DTO;

import java.io.Serializable;

public class AirportDTO implements Serializable {

	private String name;
	private String location;
	private String type;

	public AirportDTO() {

	}

	public AirportDTO(String name, String location, String type) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method in AirportDTO");
		{
			if (obj != null) {
				if (obj instanceof AirportDTO) {
					AirportDTO dto = (AirportDTO) obj;
					if (dto.location.equals(this.location)) {
						System.out.println("location is matching " + location);
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", location=" + location + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
