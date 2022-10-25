package com.xworkz.other;

import com.xworkz.boot.Mango;

public class MangoRunner {

	public static void main(String[] args) {

		Mango mango = new Mango(true);
		mango.setPrice(101.50);
		mango.quantity = 8;
		mango.display();

	}

}
