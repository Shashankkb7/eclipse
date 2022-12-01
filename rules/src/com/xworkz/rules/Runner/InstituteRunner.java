package com.xworkz.rules.Runner;

import com.xworkz.rules.DevelopmentInstitute;
import com.xworkz.rules.Institute;
import com.xworkz.rules.TestingInstitute;
import com.xworkz.rules.TrafficRules;
import com.xworkz.rules.bridge.Xworkz;
import com.xworkz.rules.bridge.XworkzRajajinagar;

public class InstituteRunner {

	public static void main(String[] args) {

		Institute institute = new XworkzRajajinagar();
		institute.placement();
		institute.training();
		System.out.println("==================================");

		TrafficRules traffic = new XworkzRajajinagar();
		traffic.tripleRiding();
		traffic.wearHelmet();
		System.out.println("==================================");

		DevelopmentInstitute development = new XworkzRajajinagar();
		development.interview();
		development.placement();
		development.training();
		System.out.println("==================================");

		TestingInstitute testing = new XworkzRajajinagar();
		testing.interview();
		testing.placement();
		testing.training();
		System.out.println("==================================");

		Xworkz xworkz = new XworkzRajajinagar();
		xworkz.placement();
		xworkz.interview();
		xworkz.training();
		System.out.println("==================================");

		XworkzRajajinagar ref = new XworkzRajajinagar();
		ref.interview();
		ref.placement();
		ref.training();
		ref.tripleRiding();
		ref.wearHelmet();
		System.out.println("==================================");

	}

}
