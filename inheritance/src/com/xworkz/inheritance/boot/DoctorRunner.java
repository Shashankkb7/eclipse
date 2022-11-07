package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Cardiologist;
import com.xworkz.inheritance.child.Dentist;
import com.xworkz.inheritance.child.ENT;
import com.xworkz.inheritance.things.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {

		Doctor doctor1 = new Doctor();
		System.out.println(doctor1.name);
		System.out.println(doctor1.doctorSalary);
		System.out.println("====================");

		Doctor doctor2 = new Dentist();
		Dentist dentist = (Dentist) doctor2;
		System.out.println(dentist.name);
		System.out.println(dentist.doctorSalary);
		System.out.println(dentist.dentistName);
		System.out.println(dentist.salary);
		System.out.println("====================");

		Doctor doctor3 = new ENT();
		ENT ent = (ENT) doctor3;
		System.out.println(ent.name);
		System.out.println(ent.doctorSalary);
		System.out.println(ent.ENTName);
		System.out.println(ent.fees);
		System.out.println("====================");

		Doctor doctor4 = new Cardiologist();
		Cardiologist cardiologist = (Cardiologist) doctor4;
		System.out.println(cardiologist.name);
		System.out.println(cardiologist.doctorSalary);
		System.out.println(cardiologist.hospitalName);
		System.out.println(cardiologist.noOfPatients);
		System.out.println("====================");
	}

}
