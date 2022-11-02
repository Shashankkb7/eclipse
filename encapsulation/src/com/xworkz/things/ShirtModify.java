package com.xworkz.things;

public class ShirtModify {

	public void useShirt(Shirt shirt) {
		System.out.println("accessing Shirt Name:" + shirt.getName());
		shirt.setName("Adidas");
		System.out.println("accessing Shirt Name:" + shirt.getType());
		shirt.setType("T shirt");
		System.out.println("accessing modfying Shirt Name:" + shirt.getName());
		System.out.println("accessing modfying Shirt Type:" + shirt.getType());
		System.out.println("Shirt idealFor:" + shirt.idealFor);
		System.out.println("Shirt color:" + shirt.color);
		System.out.println("Shirt countryOrigin:" + shirt.countryOrigin);
		System.out.println("Shirt packOf:" + shirt.packOf);
		System.out.println("Shirt size:" + shirt.size);
		System.out.println("Shirt occasion:" + shirt.occasion);
		System.out.println("Shirt CollarType:" + shirt.CollarType);
		System.out.println("Shirt price:" + shirt.price);
		System.out.println("shirt closure:" + shirt.closure);
	}
}
