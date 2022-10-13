package com.xworkz.other;

import com.xworkz.boot.Fish;

public class FishRunner {

	public static void main(String[] args) {
		
		Fish water=new Fish("jelly fish");
		System.out.println(water.name);
		System.out.println(water.type);
		System.out.println(water.price);
		System.out.println(water.weight);
		System.out.println(water.height);
		
		Fish water1=new Fish(600);
		System.out.println(water1.name);
		System.out.println(water1.type);
		System.out.println(water1.price);
		System.out.println(water1.weight);
		System.out.println(water1.height);
		
		Fish water2=new Fish("jelly fish");
		System.out.println(water2.name);
		System.out.println(water2.type);
		System.out.println(water2.price);
		System.out.println(water2.weight);
		System.out.println(water2.height);
		
		Fish water3=new Fish(20);
		System.out.println(water3.name);
		System.out.println(water3.type);
		System.out.println(water3.price);
		System.out.println(water3.weight);
		System.out.println(water3.height);
		
		Fish water4=new Fish("jelly fish",600);
		System.out.println(water4.name);
		System.out.println(water4.type);
		System.out.println(water4.price);
		System.out.println(water4.weight);
		System.out.println(water4.height);
		
		Fish water5=new Fish(25,"jelly fish");
		System.out.println(water5.name);
		System.out.println(water5.type);
		System.out.println(water5.price);
		System.out.println(water5.weight);
		System.out.println(water5.height);
		
		Fish water6=new Fish("jelly fish",25);
		System.out.println(water6.name);
		System.out.println(water6.type);
		System.out.println(water6.price);
		System.out.println(water6.weight);
		System.out.println(water6.height);
		
		Fish water7=new Fish("jelly fish",600,20);
		System.out.println(water7.name);
		System.out.println(water7.type);
		System.out.println(water7.price);
		System.out.println(water7.weight);
		System.out.println(water7.height);

	}

}
