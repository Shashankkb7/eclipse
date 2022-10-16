package com.xworkz.other;

import com.xworkz.boot.Tractor;

public class TractorRunner {
	public static void main(String[] args) {
		

	Tractor tractor = new Tractor("New Holland");
	System.out.println("name:-"+tractor.name);
	System.out.println("brand:-"+tractor.brand);
	System.out.println("price:-"+tractor.price);
	System.out.println("color:-"+tractor.color);
	System.out.println("hp:-"+tractor.hp);
	System.out.println("Model:-"+tractor.model);
	
	System.out.println(System.lineSeparator());
    Tractor tractor1 = new Tractor("Swaraj Tractor");
	System.out.println("name:-"+tractor1.name);
	System.out.println("brand:-"+tractor1.brand);
	System.out.println("price:-"+tractor1.price);
	System.out.println("color:-"+tractor1.color);
	System.out.println("hp:-"+tractor1.hp);
	System.out.println("Model:-"+tractor1.model);
	
	System.out.println(System.lineSeparator());
	Tractor tractor2 = new Tractor("Mahindra Tractor","Mahindra",560750);
	System.out.println("name:-"+tractor2.name);
	System.out.println("brand:-"+tractor2.brand);
	System.out.println("price:-"+tractor2.price);
	System.out.println("color:-"+tractor2.color);
	System.out.println("hp:-"+tractor2.hp);
	System.out.println("Model:-"+tractor2.model);
	
	System.out.println(System.lineSeparator());
	Tractor tractor3 = new Tractor("John Deere","John",450000,"Black");
	System.out.println("name:-"+tractor3.name);
	System.out.println("brand:-"+tractor3.brand);
	System.out.println("price:-"+tractor3.price);
	System.out.println("color:-"+tractor3.color);
	System.out.println("hp:-"+tractor3.hp);
	System.out.println("Model:-"+tractor3.model);
	
	System.out.println(System.lineSeparator());
	Tractor tractor4 = new Tractor("Farm Trac","FT",400000,"RED",7000);
	System.out.println("name:-"+tractor4.name);
	System.out.println("brand:-"+tractor4.brand);
	System.out.println("price:-"+tractor4.price);
	System.out.println("color:-"+tractor4.color);
	System.out.println("hp:-"+tractor4.hp);
	System.out.println("Model:-"+tractor4.model);
	
	System.out.println(System.lineSeparator());
	Tractor tractor5= new Tractor("Farm Trac","FT",400000,"RED",7000);
	System.out.println("name:-"+tractor5.name);
	System.out.println("brand:-"+tractor5.brand);
	System.out.println("price:-"+tractor5.price);
	System.out.println("color:-"+tractor5.color);
	System.out.println("hp:-"+tractor5.hp);
	System.out.println("Model:-"+tractor5.model);
				
	System.out.println(System.lineSeparator());
	Tractor tractor6 = new Tractor("Eicher","EI",300000,"Green",7350);
	System.out.println("name:-"+tractor6.name);
	System.out.println("brand:-"+tractor6.brand);
	System.out.println("price:-"+tractor6.price);
	System.out.println("color:-"+tractor6.color);
	System.out.println("hp:-"+tractor6.hp);
	System.out.println("Model:-"+tractor6.model);		
	}

}