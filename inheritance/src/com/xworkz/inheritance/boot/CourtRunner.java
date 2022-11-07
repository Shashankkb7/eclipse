package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.DistrictCourt;
import com.xworkz.inheritance.child.HighCourt;
import com.xworkz.inheritance.child.SupremeCourt;
import com.xworkz.inheritance.things.Court;

public class CourtRunner {

	public static void main(String[] args) {

		Court court = new Court();
		System.out.println(court.courtLocation);
		System.out.println(court.noOfEmployees);
		System.out.println("============================");

		Court court1 = new HighCourt();
		HighCourt highCourt = (HighCourt) court1;
		System.out.println(highCourt.courtLocation);
		System.out.println(highCourt.noOfEmployees);
		System.out.println(highCourt.highCourtJudgeName);
		System.out.println(highCourt.highCourtLocation);
		System.out.println("============================");

		Court court2 = new SupremeCourt();
		SupremeCourt supremeCourt = (SupremeCourt) court2;
		System.out.println(supremeCourt.courtLocation);
		System.out.println(supremeCourt.noOfEmployees);
		System.out.println(supremeCourt.supremeCourtJudgeName);
		System.out.println(supremeCourt.supremeCourtLocation);
		System.out.println("============================");

		Court court3 = new DistrictCourt();
		DistrictCourt districtCourt = (DistrictCourt) court3;
		System.out.println(districtCourt.courtLocation);
		System.out.println(districtCourt.noOfEmployees);
		System.out.println(districtCourt.districtCourtJudgeName);
		System.out.println(districtCourt.districtCourtLocation);
		System.out.println("============================");

	}

}
