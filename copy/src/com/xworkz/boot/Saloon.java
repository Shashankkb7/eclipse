package com.xworkz.boot;

import com.xworkz.constants.SaloonShopLocation;

public class Saloon {
	public static String shopName="M N S mens Parlour";
	public String shopOwnerName;
	public SaloonShopLocation shopLocation=SaloonShopLocation.VIJAYNAGAR;
	public int areaPinCode;
	public long shopContactNumber;

	public Saloon(String shopOwnerName) {
		this.shopOwnerName = shopOwnerName;
	}

	public void setAreaPinCode(int areaPinCode) {
		this.areaPinCode = areaPinCode;
	}

	public void display() {
		System.out.println("shopName : " + Saloon.shopName);
		System.out.println("shopOwnerName : " + this.shopOwnerName);
		System.out.println("shopLocation : " + this.shopLocation);
		System.out.println("areaPinCode : " + this.areaPinCode);
		System.out.println("shopContactNumber : " + this.shopContactNumber);

	}

}

