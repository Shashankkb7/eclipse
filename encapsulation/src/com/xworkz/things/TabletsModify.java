package com.xworkz.things;

public class TabletsModify {

	public void useTablets(Tablets tablets) {
		System.out.println("accessing tablets Name:" + tablets.getName());
		tablets.setName("Amalong");
		System.out.println("accessing tablets price:" + tablets.getPrice());
		tablets.setPrice(45);
		System.out.println("accessing modfying tablets Name:" + tablets.getName());
		System.out.println("accessing modfying tablets Price:" + tablets.getPrice());
		System.out.println("tablets expDate:" + tablets.expDate);
		System.out.println("tablets manufacturedBy:" + tablets.manufacturedBy);
		System.out.println("tablets mfDate:" + tablets.mfDate);
		System.out.println("tablets netQuantity:" + tablets.netQuantity);
		System.out.println("tablets weight:" + tablets.weight);
		System.out.println("tablets forChildren:" + tablets.forChildren);
		System.out.println("tablets paracetamol:" + tablets.paracetamol);
		System.out.println("tablets asinNumber:" + tablets.asinNumber);
		System.out.println("tablets countryofOrigin:" + tablets.countryofOrigin);
	}
}
