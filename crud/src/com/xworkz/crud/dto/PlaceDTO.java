package com.xworkz.crud.dto;

public class PlaceDTO extends AbstractAuditDTO {

	private String name;
	private double totalArea;
	private String famousFor;
	private String stateName;
	private int pincode;

	public PlaceDTO() {

	}

	public PlaceDTO(String name, double totalArea, String famousFor, String stateName, int pincode) {
		super();
		this.name = name;
		this.totalArea = totalArea;
		this.famousFor = famousFor;
		this.stateName = stateName;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", totalArea=" + totalArea + ", famousFor=" + famousFor + ", stateName="
				+ stateName + ", pincode=" + pincode + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
