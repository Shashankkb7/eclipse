package com.xworkz.things;

public class TrainModify {

	public void useTrain(Train train) {
		System.out.println("accessing Train name:" + train.getName());
		train.setName("Shatabdhi");
		System.out.println("accessing modfying Train name:" + train.getName());
		System.out.println("Train customerCareNo:" + train.customerCareNo);
		System.out.println("Train departure Location:" + train.departureLocation);
		System.out.println("Train departure Time:" + train.departureTime);
		System.out.println("Train end Location:" + train.endLocation);
		System.out.println("Train no:" + train.no);
		System.out.println("Train no Of Compartments:" + train.noOfCompartments);
		System.out.println("Train owner Name:" + train.ownerName);
		System.out.println("Train pilot Gender:" + train.pilotGender);
		System.out.println("Train reservation:" + train.reservation);
		System.out.println("Train ticket Price:" + train.ticketPrice);
	}
}
