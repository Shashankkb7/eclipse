package com.xworkz.associations.array.thing;

public class Job {

	public long salary;
	public String role;
	public boolean bond;
	public Company company;

	public Job(long salary, String role, boolean bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void showOff() {
		System.out.println("salary:" + this.salary);
		System.out.println("role:" + this.role);
		System.out.println("bond:" + this.bond);
		if (company != null) {
			System.out.println("company is printing:" + this.company);
			this.company.showOff();
		}

	}
}
