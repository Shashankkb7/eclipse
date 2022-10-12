package com.xworkz.other;

import com.xworkz.boot.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args)
	{
		Cigarette cigarette=new Cigarette();
		
		cigarette.name="gold flake";
		cigarette.price=10;
		cigarette.type="mint";
		cigarette.height="10cm";
		cigarette.weight="200g";
		cigarette.filterLength="2cm";
		cigarette.tobaccoColumnLength="8cm";
		cigarette.shape="round";
		cigarette.size="10cm";
		
		System.out.println(cigarette.name);
		System.out.println(cigarette.price);
		System.out.println(cigarette.type);
		System.out.println(cigarette.height);
		System.out.println(cigarette.weight);
		System.out.println(cigarette.filterLength);
		System.out.println(cigarette.tobaccoColumnLength);
		System.out.println(cigarette.shape);
		System.out.println(cigarette.size);
		
		System.out.println(cigarette.colour);
		System.out.println(cigarette.effect);
		System.out.println(cigarette.healthy);
		System.out.println(cigarette.gas);
		System.out.println(cigarette.chemical);
		System.out.println(cigarette.mentalDisorder);
		System.out.println(cigarette.itIskiller);
		System.out.println(cigarette.itsGoodForHealth);
		System.out.println(cigarette.time);
		

		
	}

}
