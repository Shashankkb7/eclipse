package com.xworkz.rules.bridge;

import com.xworkz.rules.GirlFriend;

public class BoyFriend implements GirlFriend {

	@Override
	public int dateOfBirth() {
		System.out.println("Date of birth");
		return 0;
	}

	@Override
	public String education() {
		System.out.println("ducaton");
		return null;
	}

	@Override
	public String location() {
		System.out.println("Location");
		return null;
	}

	@Override
	public boolean modern() {
		System.out.println("Modern");
		return false;
	}

	@Override
	public String name() {
		System.out.println("Name");
		return null;
	}

}
