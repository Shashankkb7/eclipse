package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Money;
import com.xworkz.inheritance.things.Dowry;

public class DowryRunner {

	public static void main(String[] args) {

		Dowry dowry = new Money(true, 1000000, true);
		System.out.println("Dowry details");
		System.out.println(dowry.cash);
		System.out.println(dowry.amount);
		System.out.println(dowry.crime);
	}

}
