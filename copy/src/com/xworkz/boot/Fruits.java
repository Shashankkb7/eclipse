package com.xworkz.boot;

public class Fruits {

	public String name;
	public boolean veg;
	public String[] color;
	public int quantity;
	public String[] ingredients;
	public String shape;
	public String flavour;
	public String texture;
	public int watercontent;
	public int carbohydrates;
	
	public Fruits(String name,boolean type,String[] color,int quantity,String[] ingredients,String shape,String flavour,String texture,int watercontent,int carbohydrates ) {
		this.name=name;
		this.veg=type;
		this.quantity=quantity;
		this.color=color;
		this.ingredients=ingredients;
		this.shape=shape;
		this.flavour=flavour;
		this.texture=texture;
		this.watercontent=watercontent;
		this.carbohydrates=carbohydrates;
		System.out.println("sambar construtor with 12 argument");
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.veg);
		System.out.println(this.quantity);
		System.out.println(this.color);
		System.out.println(this.shape);
		System.out.println(this.flavour);
		System.out.println(this.texture);
		System.out.println(this.watercontent);
		System.out.println(this.carbohydrates);
		for(int i=0;i<color.length;i++) {
			String string=color[i];
			System.out.println(string);
		}
		System.out.println(this.ingredients);
		for(int i=0;i<this.ingredients.length;i++) {
			String string=ingredients[i];
			System.out.println(string);
		}
		
	}
}
