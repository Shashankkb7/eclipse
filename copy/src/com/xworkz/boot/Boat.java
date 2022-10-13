package com.xworkz.boot;

public class Boat {
	
	public String name;
	public String color;
	public String companyName;
	public char type;
	public String owner;
	
	public Boat(String name)
	{
		this.name=name;
		System.out.println("created boat using parameter string constant");
	}
	
	public Boat(char type)
	{
		this.type=type;
		System.out.println("created boat using parameter char constant");
	}
	
	public Boat(String name,char type)
	{
		this.name=name;
		this.type=type;
		System.out.println("created boat using parameter string and char constant");
	}
	
	public Boat(String color,char type,String name)
	{
		this.color=color;
		this.type=type;
		this.name=name;
		System.out.println("created boat using parameter string and char and string constant");
	}
	
	public Boat(char type,String owner,String name)
	{
		this.type=type;
		this.owner=owner;
		this.name=name;
		System.out.println("created boat using parameter string and char and string constant");
	}
	
	public Boat(String companyName,String name,char type)
	{
		this.companyName=companyName;
		this.name=name;
		this.type=type;
		System.out.println("created boat using parameter string and char and string constant");
	}
	
	public Boat(String companyName,String name,char type,String owner)
	{
		this.companyName=companyName;
		this.name=name;
		this.type=type;
		this.owner=owner;
		System.out.println("created boat using parameter string and char and string constant");
	}
	
	public Boat(String companyName,String name,String color,char type)
	{
		this.companyName=companyName;
		this.name=name;
		this.color=color;
		this.type=type;
		System.out.println("created boat using parameter string and char and string constant");
	}

}
