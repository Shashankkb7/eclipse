package com.xworkz.rules.bridge;

import com.xworkz.rules.DevelopmentInstitute;
import com.xworkz.rules.TestingInstitute;
import com.xworkz.rules.TrafficRules;

public class XworkzRajajinagar implements DevelopmentInstitute, TestingInstitute, TrafficRules, Xworkz {

	@Override
	public boolean wearHelmet() {
		System.out.println("Running wear helmet");
		return false;
	}

	@Override
	public boolean tripleRiding() {
		System.out.println("Running triple riding");
		return false;
	}

	@Override
	public boolean training() {
		System.out.println("Running training");
		return false;
	}

	@Override
	public boolean placement() {
		System.out.println("Running placement");
		return false;
	}

	@Override
	public boolean interview() {
		System.out.println("Running interview");
		return false;
	}

}
