package com.xworkz.association.boot;

import com.xworkz.association.thing.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temple temple = new Temple("Anjaneya swamy", "poojari", 150, 12502);
		temple.bedkotidare("nanu");
		temple.bedkotidare("ninu");
		temple.display();
	}

}
