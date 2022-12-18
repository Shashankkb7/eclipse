package com.xworkz.crud.dto;

public class BuildingDTO extends AbstractAuditDTO {

	private int no;
	private String name;
	private int noOfFloors;
	private boolean lift;
	private boolean parking;
	private String type;

	public BuildingDTO() {

	}

	public BuildingDTO(int no, String name, int noOfFloors, boolean lift, boolean parking, String type) {
		super();
		this.no = no;
		this.name = name;
		this.noOfFloors = noOfFloors;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", name=" + name + ", noOfFloors=" + noOfFloors + ", lift=" + lift
				+ ", parking=" + parking + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
