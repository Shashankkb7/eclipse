package com.xworkz.other;

import com.xworkz.boot.Flight;

public class FlightRunner {

	public static void main(String[] args) {
		
		String[] color= {"red","blue","white"};
		String[] name= {"IndiGo","Air India","SpiceJet","Go First","AirAsia India","Vistara","Alliance Air","TruJet"};
		String[] types= {"Scheduled flights","Charter flights","Corporate aviation","Low-cost flights","International flights"};
		String[] materials= {"titanium","steel","aluminum"};
		int[] totalPassengers= {250,200,225,150};
		double[] ticketPrice= {7000.50,10000.75,15035.25,852014.25,1254.32};
		Flight flight=new Flight(123456,"petrol",0, true,true,color,name,types,materials,totalPassengers,ticketPrice);
		flight.display();
		
		}
		



}
