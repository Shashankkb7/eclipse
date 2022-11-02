package com.xworkz.things;

public class AeroplaneModify {

	public void useAeroplane(Aeroplane aeroplane) {
		System.out.println("accessing Aeroplane name:" + aeroplane.getName());
		aeroplane.setName("Qatar Airways");
		System.out.println("accessing modfying Aeroplane name:" + aeroplane.getName());
		System.out.println("Aeroplane customerCareNo:" + aeroplane.customerCareNo);
		System.out.println("Aeroplane departure Location:" + aeroplane.departureLocation);
		System.out.println("Aeroplane departure Time:" + aeroplane.departureTime);
		System.out.println("Aeroplane end Location:" + aeroplane.endLocation);
		System.out.println("Aeroplane no:" + aeroplane.no);
		System.out.println("Aeroplane no Of Seats:" + aeroplane.noOfSeats);
		System.out.println("Aeroplane owner Name:" + aeroplane.ownerName);
		System.out.println("Aeroplane pilot Gender:" + aeroplane.pilotGender);
		System.out.println("Aeroplane pilot Name:" + aeroplane.pilotName);
		System.out.println("Aeroplane ticket Price:" + aeroplane.ticketPrice);
	}
}
