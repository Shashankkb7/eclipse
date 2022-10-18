package com.xworkz.other;

import com.xworkz.boot.Vegetable;

public class VegetableRunner {

	public static void main(String[] args) {
			
			String[] items= {"carrot","beetroot","tomato","potato","brinjal"};
			String[] temp= {"green",""};
			String value="vegetables";
			Vegetable vegetable=new Vegetable(value,true,temp,4,items,"round","bitter taste","crunchy",120,10);
			System.out.println(vegetable.name);
			vegetable.display();
			
			System.out.println(vegetable.veg);
			System.out.println(vegetable.color);
			System.out.println(vegetable.quantity);
			System.out.println(vegetable.ingredients);
			System.out.println(vegetable);
			
			System.out.println(System.lineSeparator());
			Vegetable vegetable2=new Vegetable(value,true,temp,4,items,"round","bitter taste","crunchy",120,10);
			System.out.println(vegetable2.name);
			
			System.out.println(vegetable2.veg);
			System.out.println(vegetable2.color);
			System.out.println(vegetable2.quantity);
			System.out.println(vegetable2.ingredients);
			System.out.println(vegetable2);
			vegetable2.display();
			
			System.out.println(System.lineSeparator());
			Vegetable vegetable3=new Vegetable(value,true,temp,4,items,"round","bitter taste","crunchy",120,10);
			
			System.out.println(vegetable3.veg);
			System.out.println(vegetable3.color);
			System.out.println(vegetable3.quantity);
			System.out.println(vegetable3.ingredients);
			System.out.println(vegetable3);
			vegetable3.display();
			
			System.out.println(System.lineSeparator());
			Vegetable vegetable4=new Vegetable(value,true,temp,4,items,"round","bitter taste","crunchy",120,10);
			System.out.println(vegetable3.name);
			System.out.println(vegetable3.veg);
			System.out.println(vegetable3.color);
			System.out.println(vegetable3.quantity);
			System.out.println(vegetable3.ingredients);
			System.out.println(vegetable3);
			vegetable4.display();
	}

}
