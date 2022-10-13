package com.xworkz.other;

import com.xworkz.boot.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		
		Passport passport=new Passport(910812);
		System.out.println(passport.number);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issueDate);
		
		Passport passport1=new Passport("Shashank");
		System.out.println(passport1.number);
		System.out.println(passport1.name);
		System.out.println(passport1.expiryDate);
		System.out.println(passport1.country);
		System.out.println(passport1.issueDate);
		
		Passport passport2=new Passport(2030);
		System.out.println(passport2.number);
		System.out.println(passport2.name);
		System.out.println(passport2.expiryDate);
		System.out.println(passport2.country);
		System.out.println(passport2.issueDate);
		
		Passport passport3=new Passport(84316,"india");
		System.out.println(passport3.number);
		System.out.println(passport3.name);
		System.out.println(passport3.expiryDate);
		System.out.println(passport3.country);
		System.out.println(passport3.issueDate);
		
		Passport passport4=new Passport("12-2-2016",84316);
		System.out.println(passport4.number);
		System.out.println(passport4.name);
		System.out.println(passport4.expiryDate);
		System.out.println(passport4.country);
		System.out.println(passport4.issueDate);
		
		Passport passport5=new Passport(489632,2033);
		System.out.println(passport5.number);
		System.out.println(passport5.name);
		System.out.println(passport5.expiryDate);
		System.out.println(passport5.country);
		System.out.println(passport5.issueDate);
		
		Passport passport6=new Passport("sanjay",2028);
		System.out.println(passport6.number);
		System.out.println(passport6.name);
		System.out.println(passport6.expiryDate);
		System.out.println(passport6.country);
		System.out.println(passport6.issueDate);
		
		Passport passport7=new Passport("Sharath",2032,734835);
		System.out.println(passport7.number);
		System.out.println(passport7.name);
		System.out.println(passport7.expiryDate);
		System.out.println(passport7.country);
		System.out.println(passport7.issueDate);
		

	}

}
