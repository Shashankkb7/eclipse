package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.FoodCatering;
import com.xworkz.inheritance.things.Catering;

public class CateringRunner {

	public static void main(String[] args) {

		Catering catering = new FoodCatering("Shree caterers", 20, true);
		System.out.println("Catering details");
		System.out.println(catering.name);
		System.out.println(catering.noOfWorkers);
		System.out.println(catering.quality);

	}

}
