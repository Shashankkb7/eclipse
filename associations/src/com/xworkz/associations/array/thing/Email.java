package com.xworkz.associations.array.thing;

public class Email {

	public String id;
	public long password;
	public long mobileNo;
	public Company company;

	public Email(String id, long password, long mobileNo, Company company) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;

	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void showOff() {
		System.out.println("id:" + this.id);
		System.out.println("password:" + this.password);
		System.out.println("mobileNo:" + this.mobileNo);
		System.out.println("company:" + this.company);
		if (company != null) {
			System.out.println("company is printing:" + this.company);
			this.company.showOff();
		}

	}
}
