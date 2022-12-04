package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.follower.Doctor;
import com.xworkz.interfaces.governor.HospitalManagement;
import com.xworkz.interfaces.rules.HospitalRules;

public class HospitalManagementRunner {

	public static void main(String[] args) {

		HospitalRules hospital = new Doctor();
		HospitalManagement management = new HospitalManagement(hospital);
		management.checking();
	}

}
