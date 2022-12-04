package com.xworkz.interfaces.governor;

import com.xworkz.interfaces.rules.HospitalRules;

public class HospitalManagement {

	private HospitalRules hospital;

	public HospitalManagement() {
		System.out.println("Default const of hospital management...");
	}

	public HospitalManagement(HospitalRules hospital) {
		super();
		this.hospital = hospital;
	}

	public void checking() {
		System.out.println("Running wearMask and maintainSilence...");
		if (this.hospital != null) {
			boolean wearMask = this.hospital.wearMask();
			boolean maintainSilence = this.hospital.maintainSilence();
			if (wearMask == true && maintainSilence == true) {
				System.out.println("Doctor is follow the rules...");
			} else {
				System.out.println("Doctor is not follow the rules...");
			}
		}
	}
}
