package com.xworkz.things;

public class State {

	private String name = "Karnataka";
	private int noOfDistricts = 31;
	private String language = "Kannada";
	private long population = 66165886;
	private String chiefMinister = "Bommai";
	private String oldName = "Mysore";
	private String famousActor = "Dr.Rajkumar";
	private String capital = "Bangalore";
	int formationYear = 1956;
	String formationDay = "November 1st";
	String famousKingdom = "Rastrakutha";

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}

	public String getLanguage() {
		return language;
	}

	void setLanguage(String language) {
		this.language = language;
	}

	public long getPopulation() {
		return population;
	}

	void setPopulation(long population) {
		this.population = population;
	}

	public String getChiefMinister() {
		return chiefMinister;
	}

	void setChiefMinister(String chiefMinister) {
		this.chiefMinister = chiefMinister;
	}

	public String getOldName() {
		return oldName;
	}

	void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public String getFamousActor() {
		return famousActor;
	}

	void setFamousActor(String famousActor) {
		this.famousActor = famousActor;
	}

	public String getCapital() {
		return capital;
	}

	void setCapital(String capital) {
		this.capital = capital;
	}

	void setFormationYear(int formationYear) {
		this.formationYear = formationYear;
	}

	void setFormationDay(String formationDay) {
		this.formationDay = formationDay;
	}

	void setFamousKingdom(String famousKingdom) {
		this.famousKingdom = famousKingdom;
	}
}
