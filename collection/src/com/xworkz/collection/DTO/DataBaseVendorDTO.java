package com.xworkz.collection.DTO;

import java.io.Serializable;

import com.xworkz.collection.constant.Type;

public class DataBaseVendorDTO implements Serializable {

	private String name;
	private String developedBy;
	private Type type;
	private double size;
	private double licenseCost;

	public DataBaseVendorDTO() {

	}

	public DataBaseVendorDTO(String name, String developedBy, Type type, double size, double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenseCost = licenseCost;
	}

	@Override
	public int hashCode() {

		return 100;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licenseCost=" + licenseCost + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals");
		{
			if (obj != null) {
				if (obj instanceof DataBaseVendorDTO) {
					DataBaseVendorDTO dto = (DataBaseVendorDTO) obj;
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}

}
