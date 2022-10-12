package com.xworkz.other;

import com.xworkz.boot.RMD;

public class RMDRunner {

	public static void main(String[] args) {
		
		RMD rMD=new RMD();
		rMD.companyName="manik chand groups";
		rMD.estimatedDate="1991";
		rMD.companyOwner="prakash rasiklal";
		rMD.companyCEO="rupaali karnawath";
		rMD.companyLocation="india";
		rMD.companyDomain="private";
		rMD.companyGrowth="20%";
		rMD.companyCountry="india";
		rMD.noCompanyEmploys="300000";
		
		System.out.println(rMD.companyName);
		System.out.println(rMD.estimatedDate);
		System.out.println(rMD.companyOwner);
		System.out.println(rMD.companyCEO);
		System.out.println(rMD.companyLocation);
		System.out.println(rMD.companyDomain);
		System.out.println(rMD.companyGrowth);
		System.out.println(rMD.companyCountry);
		System.out.println(rMD.noCompanyEmploys);
		
		
		System.out.println(rMD.name);
		System.out.println(rMD.price);
		System.out.println(rMD.chemicalUsed);
		System.out.println(rMD.quantity);
		System.out.println(rMD.colour);
		System.out.println(rMD.agMark);
		System.out.println(rMD.availableInIndia);
		System.out.println(rMD.goodForHealth);
		System.out.println(rMD.natural);
	}

}
