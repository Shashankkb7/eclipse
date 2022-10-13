package com.xworkz.other;

import com.xworkz.boot.Boat;

public class BreadRunner {

	public static void main(String[] args) {
		
		
		Bread bread=new Bread('M');
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		Bread bread1=new Bread("Rectangle");
		System.out.println(bread1.type);
		System.out.println(bread1.shape);
		System.out.println(bread1.price);
		System.out.println(bread1.quantity);
		System.out.println(bread1.companyName);
		
		Bread bread2=new Bread(58.5);
		System.out.println(bread2.type);
		System.out.println(bread2.shape);
		System.out.println(bread2.price);
		System.out.println(bread2.quantity);
		System.out.println(bread2.companyName);
		
		Bread bread3=new Bread('M',"circle");
		System.out.println(bread3.type);
		System.out.println(bread3.shape);
		System.out.println(bread3.price);
		System.out.println(bread3.quantity);
		System.out.println(bread3.companyName);
		
		Bread bread4=new Bread("Square",'L');
		System.out.println(bread4.type);
		System.out.println(bread4.shape);
		System.out.println(bread4.price);
		System.out.println(bread4.quantity);
		System.out.println(bread4.companyName);
		
		Bread bread5=new Bread('M',60.8);
		System.out.println(bread5.type);
		System.out.println(bread5.shape);
		System.out.println(bread5.price);
		System.out.println(bread5.quantity);
		System.out.println(bread5.companyName);
		
		Bread bread6=new Bread("Rectangle",60.7);
		System.out.println(bread6.type);
		System.out.println(bread6.shape);
		System.out.println(bread6.price);
		System.out.println(bread6.quantity);
		System.out.println(bread6.companyName);
		
		Bread bread7=new Bread(59.8,"Nandini");
		System.out.println(bread7.type);
		System.out.println(bread7.shape);
		System.out.println(bread7.price);
		System.out.println(bread7.quantity);
		System.out.println(bread7.companyName);
		

	}

}
