package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("softwareEngineerName")
	private String name;
	@Autowired
	@Qualifier("softwareEngineerSalary")
	private double salary;
	@Autowired
	@Qualifier("softwareEngineerCompanyName")
	private String companyName;
	@Autowired
	@Qualifier("softwareEngineerExp")
	private int exp;

	public SoftwareEngineer() {
		System.out.println("Creating SoftwareEngineer using default const by Spring");
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName + ", exp=" + exp
				+ "]";
	}
}
