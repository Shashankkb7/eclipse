package com.xworkz.boot;

public class Cake {

	public String name;
	public int shopNo;
	public boolean veg;
	public boolean quality;
	public boolean coldCake;
	public int[] weight;
	public int[] price;
	public String[] shape;
	public String[] flavour;
	public String[] ingredients;
	public String[] color;
	
	public Cake(String name,int shopNo,boolean veg,boolean quality,boolean coldCake,int[] weight,int[] price,String[] shape,String[] flavour,String[] ingredients,String[] color)
	{
		this.name=name;
		this.shopNo=shopNo;
		this.veg=veg;
		this.quality=quality;
		this.coldCake=coldCake;
		this.weight=weight;
		this.price=price;
		this.shape=shape;
		this.flavour=flavour;
		this.ingredients=ingredients;
		this.color=color;
		System.out.println("cake constructor with 11 arguments");
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.shopNo);
		System.out.println(this.veg);
		System.out.println(this.quality);
		System.out.println(this.coldCake);
		
		for (int i = 0; i < weight.length; i++) {
			int quantity = weight[i];
		System.out.println("weight:"+ quantity);
	}
		for (int i = 0; i < price.length; i++) {
			int money = price[i];
		System.out.println("price:"+ money);
	}
		for (int i = 0; i < shape.length; i++) {
			String string = shape[i];
		System.out.println("shape:"+ string);
	}
		for (int i = 0; i < flavour.length; i++) {
			String string = flavour[i];
		System.out.println("flavour:"+ string);
	}
		for (int i = 0; i < ingredients.length; i++) {
			String string = ingredients[i];
		System.out.println("ingredients:"+ string);
	}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
		System.out.println("color:"+ string);
	}
	}
}	
