package com.xworkz.things;

public class BagModify {

	public void useBag(Bag bag) {
		System.out.println("accessing bag Brand:" + bag.getBrand());
		bag.setBrand("Trawoc");
		System.out.println("accessing bag type:" + bag.getType());
		bag.setType("Trekking");
		System.out.println("accessing modfying bag Brand:" + bag.getBrand());
		System.out.println("accessing modfying bag type:" + bag.getType());
		System.out.println("bag colorCode:" + bag.colorCode);
		System.out.println("bag idealFor:" + bag.idealFor);
		System.out.println("bag material:" + bag.material);
		System.out.println("bag noOfCompartments:" + bag.noOfCompartments);
		System.out.println("bag price:" + bag.price);
		System.out.println("bag laptopSleeve:" + bag.laptopSleeve);
		System.out.println("bag rainCover:" + bag.rainCover);
		System.out.println("bag color:" + bag.color);
		System.out.println("bag trolleySupport:" + bag.trolleySupport);
	}
}
