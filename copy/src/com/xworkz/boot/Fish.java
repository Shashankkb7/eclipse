package com.xworkz.boot;

public class Fish
{
	public String name;
	public String type;
	public int price;
	public double weight;
	public double height;
	
	public Fish(String name)
	{
		this.name=name;
		System.out.println("created fish using parameter string constant");
	}
	
	public Fish(int price)
	{
		this.price=price;
		System.out.println("created fish using parameter int constant");
	}
	
	public Fish(double weight)
	{
		this.weight=weight;
		System.out.println("created fish using parameter double constant");
	}
	
	public Fish(String name,int price)
	{
		this.name=name;
		this.price=price;
		System.out.println("created fish using parameter string and int constant");
	}
	
	public Fish(String name,double weight)
	{
		this.name=name;
		this.weight=weight;
		System.out.println("created fish using parameter string and double constant");
	}
	
	public Fish(double height,String name)
	{
		this.name=name;
		this.height=height;
		System.out.println("created fish using parameter  double and string constant");
	}
	
	public Fish(int price,double height)
	{
		this.price=price;
		this.height=height;
		System.out.println("created fish using parameter int and double constant");
	}
	
	public Fish(String name,int price,double weight)
	{
		this.name=name;
		this.price=price;
		this.weight=weight;
		System.out.println("created fish using parameter string and int and double constant");
	}
	
}
