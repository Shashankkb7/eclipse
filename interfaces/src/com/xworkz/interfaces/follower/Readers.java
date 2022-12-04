package com.xworkz.interfaces.follower;

import com.xworkz.interfaces.rules.LibraryRules;

public class Readers implements LibraryRules {

	@Override
	public boolean Smoking() {
		System.out.println("Running smoking...");
		return true;
	}

	@Override
	public boolean sleeping() {
		System.out.println("Running sleeping...");
		return true;
	}

}
