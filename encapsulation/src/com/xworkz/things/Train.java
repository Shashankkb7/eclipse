package com.xworkz.things;

public class Train {

	private String name = "Gol gumbuz";
	public String no = "1MBH520";
	String ownerName = "gottilla";
	int noOfCompartments = 15;
	String departureLocation = "Bangalore";
	String departureTime = "8:15Am";
	String endLocation = "Hubli";
	boolean reservation = true;
	char pilotGender = 'M';
	int ticketPrice = 200;
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

	void setNoOfCompartments(int noOfCompartments) {
		this.noOfCompartments = noOfCompartments;
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

	void setReservation(boolean reservation) {
		this.reservation = reservation;
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
