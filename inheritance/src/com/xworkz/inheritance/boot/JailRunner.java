package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.CentralJail;
import com.xworkz.inheritance.child.DistrictJail;
import com.xworkz.inheritance.child.SubJail;
import com.xworkz.inheritance.things.Jail;

public class JailRunner {

	public static void main(String[] args) {

		Jail jail = new Jail();
		System.out.println(jail.jailName);
		System.out.println(jail.noOfPolice);
		System.out.println("====================");

		Jail jail1 = new CentralJail();
		CentralJail centralJail = (CentralJail) jail1;
		System.out.println(centralJail.jailName);
		System.out.println(centralJail.noOfPolice);
		System.out.println(centralJail.centralJailName);
		System.out.println(centralJail.noOfRoomsInCentralJail);
		System.out.println("====================");

		Jail jail2 = new DistrictJail();
		DistrictJail districtJail = (DistrictJail) jail2;
		System.out.println(districtJail.jailName);
		System.out.println(districtJail.noOfPolice);
		System.out.println(districtJail.districtJailName);
		System.out.println(districtJail.noOfRoomsInDistrictJail);
		System.out.println("====================");

		Jail jail3 = new SubJail();
		SubJail subJail = (SubJail) jail3;
		System.out.println(subJail.jailName);
		System.out.println(subJail.noOfPolice);
		System.out.println(subJail.subJailName);
		System.out.println(subJail.noOfRoomsInSubJail);
		System.out.println("====================");
	}
}
