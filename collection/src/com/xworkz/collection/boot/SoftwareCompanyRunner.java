package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyRunner {

	public static void main(String[] args) {

		String company1 = "TCS";
		String company2 = "Wipro";
		String company3 = "Infosys";
		String company4 = "IBM";
		String company5 = "Accenture";
		String company6 = "Flipkart";
		String company7 = "Amazon";
		String company8 = "Hexaware";
		String company9 = "HCL";
		String company10 = "HP";
		String company11 = "Dell";
		String company12 = "DXC";
		String company13 = "Facebook";
		String company14 = "Twitter";
		String company15 = "Apple";
		String company16 = "Google";
		String company17 = "Microsoft";
		String company18 = "Huawei";
		String company19 = "Harman";
		String company20 = "Sony";

		Collection<String> company = new ArrayList<String>();
		company.add(company1);
		company.add(company2);
		company.add(company3);
		company.add(company4);
		company.add(company5);
		company.add(company6);
		company.add(company7);
		company.add(company8);
		company.add(company9);
		company.add(company10);
		company.add(company11);
		company.add(company12);
		company.add(company13);
		company.add(company14);
		company.add(company15);
		company.add(company16);
		company.add(company17);
		company.add(company18);
		company.add(company19);
		company.add(company20);

		for (String ref : company) {
			System.out.println(ref);
		}

		System.out.println("=======Iterator=======");

		Iterator<String> iterator = company.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
