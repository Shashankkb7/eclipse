package com.xworkz.other;

import com.xworkz.boot.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flower flower = new Flower("Yellow");
		flower.flowerShape("Round");
		flower.quantity = 25;
		flower.torsu();
		flower.totalPrice();

	}

}
