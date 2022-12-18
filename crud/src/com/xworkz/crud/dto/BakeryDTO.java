package com.xworkz.crud.dto;

import java.time.LocalDateTime;

public class BakeryDTO extends AbstractAuditDTO {

	private String name;
	private String ownerName;
	private String location;
	private String famousFor;
	private long phNo;

	public BakeryDTO() {

	}

	public BakeryDTO(String name, String ownerName, String location, String famousFor, long phNo, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.ownerName = ownerName;
		this.location = location;
		this.famousFor = famousFor;
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", location=" + location + ", famousFor="
				+ famousFor + ", phNo=" + phNo + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

}
