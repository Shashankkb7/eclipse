package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.RadioDj;
import com.xworkz.inheritance.things.DJ;

public class DJRunner {

	public static void main(String[] args) {

		DJ dj = new RadioDj("David Guetta", 11, "Club DJ");
		System.out.println("DJ details");
		System.out.println(dj.name);
		System.out.println(dj.noOfSingers);
		System.out.println(dj.type);
	}

}
