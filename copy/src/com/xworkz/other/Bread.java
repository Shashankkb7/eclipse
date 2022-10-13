package com.xworkz.other;

public class Bread {

	public char type;
	public String shape;
	public int price;
	public double quantity;
	public String companyName;
	
	public Bread(char type)
	{
	this.type=type;
	System.out.println("created boat using parameter char constant");
	}
	
	public Bread(String shape)
	{
	this.shape=shape;
	System.out.println("created boat using parameter string constant");
	}
	
	public Bread(double quantity)
	{
	this.quantity=quantity;
	System.out.println("created boat using parameter boolean constant");
	}
	
	public Bread(char type,String shape)
	{
	this.type=type;
	this.shape=shape;
	System.out.println("created boat using parameter char and string constant");
	}
	
	public Bread(String shape,char type)
	{
	this.shape=shape;
	this.type=type;
	System.out.println("created boat using parameter string and char constant");
	}
	
	public Bread(char type,double quantity)
	{
	this.type=type;
	this.quantity=quantity;
	System.out.println("created boat using parameter char and double constant");
	}
	
	public Bread(String shape,double quantity)
	{
	this.shape=shape;
	this.quantity=quantity;
	System.out.println("created boat using parameter string and double constant");
	}
	
	public Bread(double quantity,String companyName)
	{
	this.quantity=quantity;
	this.companyName=companyName;
	System.out.println("created boat using parameter double and string constant");
	}
}
