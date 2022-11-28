package com.xworkz.rules.bridge;

import com.xworkz.rules.Parent;

public class Children implements Parent {

	@Override
	public boolean descent() {
		System.out.println("Descent");
		return true;
	}

	@Override
	public boolean father() {
		System.out.println("father");
		return false;
	}

	@Override
	public boolean name() {
		System.out.println("name");
		return true;
	}

	@Override
	public boolean useMobile() {
		System.out.println("use mobile");
		return true;
	}

	@Override
	public boolean working() {
		System.out.println("working");
		return false;
	}
}
