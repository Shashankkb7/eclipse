package com.xworkz.rules.bridge;

import com.xworkz.rules.PoliceStation;

public class Thiefs implements PoliceStation {

	@Override
	public boolean constables() {
		System.out.println("Constables");
		return false;
	}

	@Override
	public String location() {
		System.out.println("Location");
		return null;
	}

	@Override
	public String name() {
		System.out.println("Name");
		return null;
	}

	@Override
	public boolean si() {
		System.out.println("Si");
		return false;
	}

	@Override
	public boolean thiefs() {
		System.out.println("Thiefs");
		return false;
	}

}
