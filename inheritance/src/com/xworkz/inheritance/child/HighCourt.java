package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Court;

public class HighCourt extends Court {

	public String highCourtJudgeName;
	public String highCourtLocation;

	public HighCourt() {
		System.out.println("Default HighCourt constr");
	}
}
