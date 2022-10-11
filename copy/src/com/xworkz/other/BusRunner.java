package com.xworkz.other;

import com.xworkz.boot.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		Bus bus1=new Bus();
		System.out.println(bus1.number);
		System.out.println(bus1.starting);
		System.out.println(bus1.destination);
		bus1.number="KA 16 F 1245";
		bus1.starting="Bangalore";
		bus1.destination="Chitradurga";
		System.out.println(bus1.number);
		System.out.println(bus1.starting);
		System.out.println(bus1.destination);
		

	}

}
