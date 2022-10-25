package com.xworkz.constants;

public enum Description {

	NAME_1("SHASHANK",275.45),NAME_2("DARSHAN",240.25),NAME_3("VIKKI",248.25);
	
	public String developers;
	public double sizes;
	
	private Description(String developers,double sizes)
	{
		this.developers=developers;
		this.sizes=sizes;
	}
}
