package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.ArriangeMarriage;
import com.xworkz.inheritance.things.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {

		Marriage marriage = new ArriangeMarriage("Arriange marriage", "Bangalore", "11/11/2022");
		System.out.println("Marriage details");
		System.out.println(marriage.type);
		System.out.println(marriage.date);
		System.out.println(marriage.venue);
	}

}
