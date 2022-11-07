package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Doctor;

public class Dentist extends Doctor {

	public String dentistName;
	public double salary;

	public Dentist() {
		System.out.println("Default Dentist constr");
	}
}
