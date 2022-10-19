package com.xworkz.boot;


public class Flight {
	
	public int flightNumber;
	public String fuel;
	public int weight;
	public boolean travel;
	public boolean lift;
	public String[] color;
	public String[] name;
	public String[] types;
	public String[] materials;
	public int[] totalPassengers;
	public double[] ticketPrice;
	
	
	public Flight(int flightNumber,String fuel,int weight,boolean travel,boolean lift,String[] color,String[] name,String[] types,String[] materials2,int[] totalPassengers2,double[] ticketPrice)
	{
		this.flightNumber=flightNumber;
		this.fuel=fuel;
		this.weight=weight;
		this.travel=travel;
		this.lift=lift;
		this.color=color;
		this.name=name;
		this.types=types;
		this.materials=materials2;
		this.totalPassengers=totalPassengers2;
		this.ticketPrice=ticketPrice;
		System.out.println("flight const with 11 arguments");
	}
	public void display()
	{
		System.out.println(this.flightNumber);
		System.out.println(this.fuel);
		System.out.println(this.weight);
		System.out.println(this.travel);
		System.out.println(this.lift);
		
		System.out.println(System.lineSeparator());
		for (int i = 0; i < color.length; i++) {
			String string=color[i];
			System.out.println(string);	
		}
		for (int i = 0; i < name.length; i++) {
			String word = name[i];
			System.out.println(word);
		}
		for (int i = 0; i < materials.length; i++) {
			String product= materials[i];
			System.out.println(product);
			
		}
		for (int i = 0; i < types.length; i++) {
			String different = types[i];
			System.out.println(different);
			
		}
		for (int i = 0; i < totalPassengers.length; i++) {
			int passengers= totalPassengers[i];
			System.out.println(passengers);
			
		}
		for (int i = 0; i < ticketPrice.length; i++) {
			double amount = ticketPrice[i];
			System.out.println(amount);
		}
		
	}
}