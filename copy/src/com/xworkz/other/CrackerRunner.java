package com.xworkz.other;

import com.xworkz.boot.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cracker cracker = new Cracker(true);
		cracker.setPrice(1000.20);
		cracker.quantity = 25;
		cracker.show();
		cracker.totalPrice();
	}

}
