package com.xworkz.boot;

import com.xworkz.things.Aeroplane;
import com.xworkz.things.AeroplaneModify;

public class AeroplaneRunner {

	public static void main(String[] args) {

		Aeroplane aeroplane = new Aeroplane();
		System.out.println(aeroplane.getName());
		AeroplaneModify modify = new AeroplaneModify();
		modify.useAeroplane(aeroplane);

	}

}
