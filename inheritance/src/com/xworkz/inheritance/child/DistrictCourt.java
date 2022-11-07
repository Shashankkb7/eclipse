package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Court;

public class DistrictCourt extends Court {

	public String districtCourtJudgeName;
	public String districtCourtLocation;

	public DistrictCourt() {
		System.out.println("Default DistrictCourt constr");
	}
}
