package com.xworkz.boot;

public class Pizza {
	
	public String name;
	public int shopNo;
	public boolean veg;
	public boolean quality;
	public boolean hot;
	public int[] weight;
	public double[] price;
	public String[] sizes;
	public String[] types;
	public String[] ingredients;
	public String[] color;
	
	public Pizza(String name,int shopNo,boolean veg,boolean quality,boolean hot,int[] weight,double[] price,String[] sizes,String[] types,String[] ingredients,String[] color)
	{
		this.name=name;
		this.shopNo=shopNo;
		this.veg=veg;
		this.quality=quality;
		this.hot=hot;
		this.weight=weight;
		this.price=price;
		this.sizes=sizes;
		this.types=types;
		this.ingredients=ingredients;
		this.color=color;
		System.out.println("Pizza constructor with 11 arguments");
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.shopNo);
		System.out.println(this.veg);
		System.out.println(this.quality);
		System.out.println(this.hot);
		
		for (int i = 0; i < weight.length; i++) {
			int quantity = weight[i];
		System.out.println("weight:"+ quantity);
	}
		for (int i = 0; i < price.length; i++) {
			double money = price[i];
		System.out.println("price:"+ money);
	}
		for (int i = 0; i < sizes.length; i++) {
			String string = sizes[i];
		System.out.println("sizes:"+ string);
	}
		for (int i = 0; i < types.length; i++) {
			String string = types[i];
		System.out.println("types:"+ string);
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
