package com.xworkz.boot;

public class Pen {

	public String[] names; 
	public String[] sizes;
	public String[] color;
	public String[] types;
	public double[] price;
	public double[] weight;
	public boolean stock;
	public boolean plastic;
	public boolean brighter;
	public boolean smoother;
	public boolean ballPen;
	
	public Pen(String[] names,String[] sizes,String[] color,String[] types,double[] price,double[] weight,boolean stock,boolean type,boolean brighter,boolean smoother,boolean ballPen) {
		
		
		this.names=names;
		this.sizes=sizes;
		this.color=color;
		this.types=types;
		this.price=price;
		this.weight=weight;
		this.stock=stock;
		this.plastic=type;
		this.brighter=brighter;
		this.smoother=smoother;
		this.ballPen=ballPen;
		System.out.println("pen constructor with 11 arguments");
	}
	
	public void torsu() {
		
		System.out.println("pen stock:"+this.stock);
		System.out.println("pen plastic:"+this.plastic);
		System.out.println("pen brighter:"+this.brighter);
		System.out.println("pen smoother:"+this.smoother);
		System.out.println("pen ballPen:"+this.ballPen);
		
		for (int i = 0; i < names.length; i++) {
			String string = names[i];
			System.out.println("pen names:"+ string);
		}
		for (int i = 0; i < sizes.length; i++) {
			String string = sizes[i];
			System.out.println("pen sizes:"+ string);
		}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println("pen color:"+ string);
		}
		for (int i = 0; i < types.length; i++) {
			String string = types[i];
			System.out.println("pen types:"+ string);
		}
		for (int i = 0; i < price.length; i++) {
			double amount = price[i];
			System.out.println("pen price:"+ amount);
		}
		for (int i = 0; i < weight.length; i++) {
			double grams = weight[i];
			System.out.println("pen weight:"+ grams);
		}
	
	}
}
