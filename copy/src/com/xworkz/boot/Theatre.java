package com.xworkz.boot;

import com.xworkz.constructor.Languages;
import com.xworkz.constructor.SeatType;

public class Theatre {

	public String name;
	public String location;
	public String ownerName;
	public boolean nonAc;
	public int capacity;
	public double[] ticketPrice;
	public int[] noOfScreens;
	public String[] filmNames;
	public String[] effects;
	public SeatType FIRST_CLASS;
	public Languages KANNADA;
	
	public Theatre(String name,String location,String ownerName,boolean nonAc,int capacity,double[] ticketPrice,int[] noOfScreens,String[] filmNames,String[] effects,SeatType FIRST_CLASS,Languages KANNADA)
	{
		this.name=name;
		this.location=location;
		this.ownerName=ownerName;
		this.nonAc=nonAc;
		this.capacity=capacity;
		this.ticketPrice=ticketPrice;
		this.noOfScreens=noOfScreens;
		this.filmNames=filmNames;
		this.effects=effects;
		this.FIRST_CLASS=FIRST_CLASS;
		this.KANNADA=KANNADA;
	
	}
	public void show()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.ownerName);
		System.out.println(this.nonAc);
		System.out.println(this.capacity);
		System.out.println(this.FIRST_CLASS);
		System.out.println(this.KANNADA);
		
		for (int i = 0; i < ticketPrice.length; i++) {
			double quantity = ticketPrice[i];
		System.out.println("ticketPrice:"+ quantity);
	}
		for (int i = 0; i < noOfScreens.length; i++) {
			int  money = noOfScreens[i];
		System.out.println("noOfScreens:"+ money);
	}
		for (int i = 0; i < filmNames.length; i++) {
			String string = filmNames[i];
		System.out.println("filmNames:"+ string);
	}
		for (int i = 0; i < effects.length; i++) {
			String string = effects[i];
		System.out.println("effects:"+ string);
	}
	}
	
}
