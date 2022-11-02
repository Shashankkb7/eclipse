package com.xworkz.things;

public class Aeroplane {

	private String name = "Jet Airways";
	public String no = "1knj450";
	String ownerName = "gottilla";
	int noOfSeats = 400;
	String departureLocation = "Bangalore";
	String departureTime = "9Am";
	String endLocation = "Delhi";
	String pilotName = "Suresh";
	char pilotGender = 'M';
	int ticketPrice = 2000;
	int customerCareNo = 123456782;

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public void setNo(String no) {
		this.no = no;
	}

	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}

	void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	void setCustomerCareNo(int customerCareNo) {
		this.customerCareNo = customerCareNo;
	}

	void setPilotGender(char pilotGender) {
		this.pilotGender = pilotGender;
	}

}
