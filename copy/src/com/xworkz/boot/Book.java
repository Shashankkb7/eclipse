package com.xworkz.boot;

public class Book {
	
	public String[] names; 
	public String[] sizes;
	public String[] color;
	public int[] pages;
	public double[] price;
	public double[] weight;
	public boolean stock;
	public boolean whiter;
	public boolean brighter;
	public boolean smoother;
	public boolean singleLine;
	
	public Book(String[] names,String[] sizes,String[] color,int[] pages,double[] price,double[] weight,boolean stock,boolean type,boolean brighter,boolean smoother,boolean singleLine) {
		
		
		this.names=names;
		this.sizes=sizes;
		this.color=color;
		this.pages=pages;
		this.price=price;
		this.weight=weight;
		this.stock=stock;
		this.whiter=type;
		this.brighter=brighter;
		this.smoother=smoother;
		this.singleLine=singleLine;
		System.out.println("book constructor with 11 arguments");
	}
	
	public void show() {
		
		System.out.println("book stock:"+this.stock);
		System.out.println("book whiter:"+this.whiter);
		System.out.println("book brighter:"+this.brighter);
		System.out.println("book smoother:"+this.smoother);
		System.out.println("book singleLine:"+this.singleLine);
		
		for (int i = 0; i < names.length; i++) {
			String string = names[i];
			System.out.println("book names:"+ string);
		}
		for (int i = 0; i < sizes.length; i++) {
			String string = sizes[i];
			System.out.println("book sizes:"+ string);
		}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println("book color:"+ string);
		}
		for (int i = 0; i < pages.length; i++) {
			int integer = pages[i];
			System.out.println("book pages:"+ integer);
		}
		for (int i = 0; i < price.length; i++) {
			double amount = price[i];
			System.out.println("book price:"+ amount);
		}
		for (int i = 0; i < weight.length; i++) {
			double grams = weight[i];
			System.out.println("book weight:"+ grams);
		}
	
	}
	
	
	
	
	

}
