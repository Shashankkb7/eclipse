package com.xworkz.other;

import com.xworkz.boot.Fruits;

public class FruitsRunner {

	public static void main(String[] args) {
			
			String[] items= {"apple","banana","grapes","pineapple","orange"};
			String[] temp= {"red","black"};
			String value="fruits";
			
			Fruits fruit=new Fruits(value,true,temp,4,items,"round","bitter taste","crunchy",120,10);
			System.out.println(fruit.name);
			fruit.display();
			
			System.out.println(fruit.veg);
			System.out.println(fruit.color);
			System.out.println(fruit.quantity);
			System.out.println(fruit.ingredients);
			System.out.println(fruit);
			
			System.out.println(System.lineSeparator());
			Fruits fruit2=new Fruits(value,true,temp,4,items,"round","bitter taste","crunchy",120,10);
			System.out.println(fruit2.name);
			System.out.println(fruit2.veg);
			System.out.println(fruit2.color);
			System.out.println(fruit2.quantity);
			System.out.println(fruit2.ingredients);
			System.out.println(fruit2);
			fruit2.display();
			
			System.out.println(System.lineSeparator());
			Fruits fruit3=new Fruits(value,true,temp,4,items,"round","bitter taste","crunchy",120,10);
			
			System.out.println(fruit3.veg);
			System.out.println(fruit3.color);
			System.out.println(fruit3.quantity);
			System.out.println(fruit3.ingredients);
			System.out.println(fruit3);
			fruit3.display();
			
			System.out.println(System.lineSeparator());
			Fruits fruit4=new Fruits(value,true,temp,4,items,"round","bitter taste","crunchy",120,10);
			System.out.println(fruit4.name);
			System.out.println(fruit4.veg);
			System.out.println(fruit4.color);
			System.out.println(fruit4.quantity);
			System.out.println(fruit4.ingredients);
			System.out.println(fruit4);
			fruit4.display();
}
}