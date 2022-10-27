package com.xworkz.association.boot;

import com.xworkz.association.constants.PillarShape;
import com.xworkz.association.thing.Pillar;

public class PillarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pillar pillar = new Pillar(201, "rajajinagar", PillarShape.RECTANGLE);
		pillar.constructing("pillar1");
		pillar.constructing("pillar2");
		pillar.display();
	}

}
