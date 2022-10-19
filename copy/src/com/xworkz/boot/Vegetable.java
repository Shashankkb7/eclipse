package com.xworkz.boot;

public class Vegetable {

	
	public boolean veg;
	public String flavour;
	public String texture;
	public int watercontent;
	public int carbohydrates;
	public String[] quantity;
	public String[] ingredients;
	public String[] shape;
	public String[] name;
	public String[] color;
	public double[] price;
	
	
	public Vegetable(boolean type,String flavour,String texture,int watercontent,int carbohydrates,String[] size,String[] ingredients,String[] shape,String[] name,String[] color,double[] price) {
		
		this.veg=type;
		this.flavour=flavour;
		this.texture=texture;
		this.watercontent=watercontent;
		this.carbohydrates=carbohydrates;
		this.quantity=size;
		this.ingredients=ingredients;
		this.shape=shape;
		this.name=name;
		this.color=color;
		this.price=price;
		System.out.println("vegetable construtor with 11 argument");
	}
		public void display() {
		
		System.out.println(this.veg);
		System.out.println(this.flavour);
		System.out.println(this.texture);
		System.out.println(this.watercontent);
		System.out.println(this.carbohydrates);
		
		System.out.println(System.lineSeparator());
		for(int i=0;i<quantity.length;i++) {
			String string=quantity[i];
			System.out.println(string);
		}
		for(int i=0;i<ingredients.length;i++) {
			String ref=ingredients[i];
			System.out.println(ref);
		}
		for(int i=0;i<shape.length;i++) {
			String size=shape[i];
			System.out.println(size);
		}
		for(int i=0;i<name.length;i++) {
			String ref1=name[i];
			System.out.println(ref1);
		}
		for(int i=0;i<color.length;i++) {
			String string1=quantity[i];
			System.out.println(string1);
		}
		for(int i=0;i<price.length;i++) {
			double ref2=price[i];
			System.out.println(ref2);
		}
		
	}
}
