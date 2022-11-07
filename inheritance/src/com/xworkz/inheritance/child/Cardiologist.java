package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Doctor;

public class Cardiologist extends Doctor {

	public String hospitalName;
	public int noOfPatients;

	public Cardiologist() {
		System.out.println("Default Cardilogist constr");
	}

}
