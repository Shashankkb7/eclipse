package com.xworkz.collection.DTO;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {

	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;

	public ApplicationDTO() {

	}

	public ApplicationDTO(String name, double version, boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public int hashCode() {

		return 60;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals");
		{
			if (obj != null) {
				if (obj instanceof ApplicationDTO) {
					ApplicationDTO dto = (ApplicationDTO) obj;
					{
						if (dto.name.equals(this.name)) {
							System.out.println("name " + dto);
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

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
