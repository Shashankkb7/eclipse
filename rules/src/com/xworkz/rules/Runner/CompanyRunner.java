package com.xworkz.rules.Runner;

import com.xworkz.rules.Company;
import com.xworkz.rules.bridge.Employees;

public class CompanyRunner {

	public static void main(String[] args) {

		Company company = new Employees();
		Employees employ = new Employees();
		company.ceo();
		employ.name();
		employ.skillsRequired();
		employ.noOfEmployees();
		employ.nonIT();

	}

}
