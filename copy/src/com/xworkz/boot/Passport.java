package com.xworkz.boot;

public class Passport {

	public long number;
	public String name;
	public int expiryDate;
	public String country;
	public String issueDate;
	
	public Passport(long number)
	{
		this.number=number;
		System.out.println("passport number");
	}
	
	public Passport(String name)
	{
		this.name=name;
		System.out.println("passport name");
	}
	
	public Passport(int expiryDate)
	{
		this.expiryDate=expiryDate;
		System.out.println("passport expiry date");
	}
	
	public Passport(long number,String country)
	{
		this.number=number;
		this.country=country;
		System.out.println("passport number");
		System.out.println("passport country");
	}
	
	public Passport(String issueDate,long number)
	{
		this.issueDate=issueDate;
		this.number=number;
		System.out.println("passport number");
		System.out.println("passport issue date");
	}
	
	public Passport(long number,int expiryDate)
	{
		this.number=number;
		this.expiryDate=expiryDate;
		System.out.println("passport number");
		System.out.println("passport expiry date");
	}
	
	public Passport(String name,int expiryDate)
	{
		this.name=name;
		this.expiryDate=expiryDate;
		System.out.println("passport name");
		System.out.println("passport expiry date");
	}
	
	public Passport(String name,int expiryDate,long number)
	{
		this.name=name;
		this.expiryDate=expiryDate;
		this.number=number;
		System.out.println("passport name");
		System.out.println("passport expiry date");
		System.out.println("passport number");
		
	}
	
}
