package com.xworkz.other;

import com.xworkz.boot.Boat;

public class BoatRunner {

	public static void main(String[] args) {
		
		Boat boat=new Boat("Titanic");
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.type);
		System.out.println(boat.owner);
		
		Boat boat1=new Boat('L');
		System.out.println(boat1.name);
		System.out.println(boat1.color);
		System.out.println(boat1.companyName);
		System.out.println(boat1.type);
		System.out.println(boat1.owner);
		
		Boat boat2=new Boat("Titanic",'M');
		System.out.println(boat2.name);
		System.out.println(boat2.color);
		System.out.println(boat2.companyName);
		System.out.println(boat2.type);
		System.out.println(boat2.owner);
		
		Boat boat3=new Boat("red",'M',"Titanic");
		System.out.println(boat3.name);
		System.out.println(boat3.color);
		System.out.println(boat3.companyName);
		System.out.println(boat3.type);
		System.out.println(boat3.owner);
		
		Boat boat4=new Boat('L',"Vijay malya","Titanic");
		System.out.println(boat4.name);
		System.out.println(boat4.color);
		System.out.println(boat4.companyName);
		System.out.println(boat4.type);
		System.out.println(boat4.owner);
		
		Boat boat5=new Boat("King fisher","Titanic",'M');
		System.out.println(boat5.name);
		System.out.println(boat5.color);
		System.out.println(boat5.companyName);
		System.out.println(boat5.type);
		System.out.println(boat5.owner);
		
		Boat boat6=new Boat("King fisher","Titanic",'M',"Vijay malya");
		System.out.println(boat6.name);
		System.out.println(boat6.color);
		System.out.println(boat6.companyName);
		System.out.println(boat6.type);
		System.out.println(boat6.owner);
		
		Boat boat7=new Boat("King fisher","Titanic","red",'M');
		System.out.println(boat7.name);
		System.out.println(boat7.color);
		System.out.println(boat7.companyName);
		System.out.println(boat7.type);
		System.out.println(boat7.owner);
		

	}

}
