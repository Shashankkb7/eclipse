package com.xworkz.rules.bridge;

import com.xworkz.rules.Company;

public class Employees implements Company {

	@Override
	public boolean skillsRequired() {
		System.out.println("Skills required");
		return true;
	}

	@Override
	public String name() {
		System.out.println("name");
		return null;
	}

	@Override
	public int noOfEmployees() {
		System.out.println("no of employees");
		return 0;
	}

	@Override
	public char ceo() {
		System.out.println("ceo");
		return 0;
	}

	@Override
	public boolean nonIT() {
		System.out.println("non IT");
		return false;
	}
}
