package com.xworkz.boot;

import com.xworkz.things.State;
import com.xworkz.things.StateModify;

public class StateRunner {

	public static void main(String[] args) {

		State state = new State();
		System.out.println(state.getName());
		System.out.println(state.getCapital());
		System.out.println(state.getChiefMinister());
		System.out.println(state.getFamousActor());
		System.out.println(state.getLanguage());
		System.out.println(state.getNoOfDistricts());
		System.out.println(state.getOldName());
		System.out.println(state.getPopulation());

		StateModify modify = new StateModify();
		modify.useState(state);

	}

}
