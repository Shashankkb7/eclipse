package com.xworkz.things;

public class StateModify {

	public void useState(State state) {
		System.out.println("accessing State properties");
		state.setName("Karunadu");
		System.out.println("accessing modfying state name:" + state.getName());
		state.setCapital("Mysore");
		System.out.println("accessing modfying state Capital:" + state.getCapital());
		state.setChiefMinister("BSY");
		System.out.println("accessing modfying state ChiefMinister:" + state.getChiefMinister());
		state.setFamousActor("Shankar nag");
		System.out.println("accessing modfying state FamousActor:" + state.getFamousActor());
		state.setLanguage("Hindi");
		System.out.println("accessing modfying state Language:" + state.getLanguage());
		state.setNoOfDistricts(29);
		System.out.println("accessing modfying state No Of Districts:" + state.getNoOfDistricts());
		state.setOldName("Old Mysore");
		System.out.println("accessing modfying state OldName:" + state.getOldName());
		state.setPopulation(5485200);
		System.out.println("accessing modfying state Population:" + state.getPopulation());

		System.out.println("State famous Kingdom:" + state.famousKingdom);
		System.out.println("State formation Day:" + state.formationDay);
		System.out.println("State formation Year:" + state.formationYear);

	}

}
