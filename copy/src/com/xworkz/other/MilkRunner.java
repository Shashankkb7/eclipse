package com.xworkz.other;

import com.xworkz.boot.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Milk milk = new Milk(24);
		milk.name = "Manu";
		milk.setQuantity(1);
		milk.display();
	}

}
