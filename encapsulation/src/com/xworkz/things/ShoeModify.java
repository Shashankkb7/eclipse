package com.xworkz.things;

public class ShoeModify {

	public void useShoe(Shoe shoe) {
		System.out.println("accessing shoe Name:" + shoe.getName());
		shoe.setName("Nike");
		System.out.println("accessing modfying shoe Name:" + shoe.getName());
		System.out.println("shoe color:" + shoe.color);
		System.out.println("shoe closure:" + shoe.closure);
		System.out.println("shoe type:" + shoe.type);
		System.out.println("shoe countryOrigin:" + shoe.countryOrigin);
		System.out.println("shoe idealFor:" + shoe.idealFor);
		System.out.println("shoe occasion:" + shoe.occasion);
		System.out.println("shoe packOf:" + shoe.packOf);
		System.out.println("shoe price:" + shoe.price);
		System.out.println("shoe size:" + shoe.size);
		System.out.println("shoe tipShape:" + shoe.tipShape);
	}
}
