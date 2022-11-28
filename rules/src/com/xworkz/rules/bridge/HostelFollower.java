package com.xworkz.rules.bridge;

import com.xworkz.rules.Hostel;

public class HostelFollower implements Hostel {

	@Override
	public boolean boys() {
		System.out.println("For boys");
		return true;
	}

	@Override
	public String location() {
		System.out.println("location");
		return null;
	}

	@Override
	public int noOfStudents() {
		System.out.println("no of students");
		return 0;
	}

	@Override
	public boolean warden() {
		System.out.println("warden");
		return true;
	}

	@Override
	public boolean wearMask() {
		System.out.println("wear mask");
		return true;
	}

}
