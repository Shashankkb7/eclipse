package com.xworkz.boot;

import com.xworkz.constants.ShirtBrandHeadquarters;

public class ShirtBrand {

	public static String brand = "Peter England";
	public String country;
	public String chiefExecutiveOfficer_CEO;
	public long customerCareNumber;
	public ShirtBrandHeadquarters headQuarters = ShirtBrandHeadquarters.KOLAR;

	public ShirtBrand(String chiefExecutiveOfficer_CEO) {
		this.chiefExecutiveOfficer_CEO = chiefExecutiveOfficer_CEO;
	}

	public void setCustomerCareNumber(long customerCareNumber) {
		this.customerCareNumber = customerCareNumber;
	}

	public void display() {
		System.out.println("brand : " + ShirtBrand.brand);
		System.out.println("country : " + this.country);
		System.out.println("CEO : " + this.chiefExecutiveOfficer_CEO);
		System.out.println("customerCareNumber : " + this.customerCareNumber);
		System.out.println("headQuarters : " + this.headQuarters);
	}
}
