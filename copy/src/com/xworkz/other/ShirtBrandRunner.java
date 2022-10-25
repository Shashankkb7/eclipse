package com.xworkz.other;

import com.xworkz.boot.ShirtBrand;

public class ShirtBrandRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShirtBrand shirtBrand = new ShirtBrand("Vishak Kumar");
		shirtBrand.setCustomerCareNumber(1034585220);
		shirtBrand.country = "India";
		shirtBrand.display();
	}

}
