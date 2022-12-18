package com.xworkz.crud.dto;

import java.time.LocalDateTime;

public class TheatreDTO extends AbstractAuditDTO {

	private int id;
	private String name;
	private String brand;
	private int noOfSeats;

	public TheatreDTO() {

	}

	public TheatreDTO(int id, String name, String brand, int noOfSeats, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "Theatre [id=" + id + ", name=" + name + ", brand=" + brand + ", noOfSeats=" + noOfSeats
				+ ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

}
