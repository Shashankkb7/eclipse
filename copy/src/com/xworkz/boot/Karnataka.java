package com.xworkz.boot;

public class Karnataka {
	
	public String stateName;
	public String chiefMinister;
	public String capitalCity;
	public int noOfDistricts;
	public int population;
	public String[] ministersName;
	public String[] famousplaces;
	public String[] districts;
	public String[] indianTeamCricketers;
	public String[] famousDistricts;
	public String[] famousActres;
	
	public Karnataka(String stateName,String chiefMinister,String capitalCity,int noOfDistricts,int population,String[] ministersName,String[] famousplaces,String[] districts,String[] indianTeamCricketers,String[] famousDistricts,String[] famousActres) {
		
		
		this.stateName=stateName;
		this.chiefMinister=chiefMinister;
		this.capitalCity=capitalCity;
		this.noOfDistricts=noOfDistricts;
		this.population=population;
		this.ministersName=ministersName;
		this.famousplaces=famousplaces;
		this.districts=districts;
		this.indianTeamCricketers=indianTeamCricketers;
		this.famousDistricts=famousDistricts;
		this.famousActres=famousActres;
		System.out.println("karnataka constructor with 11 arguments");
	}
	public void open()
	{
		System.out.println(this.stateName);
		System.out.println(this.chiefMinister);
		System.out.println(this.capitalCity);
		System.out.println(this.noOfDistricts);
		System.out.println(this.population);
		
	
		for (int i = 0; i < ministersName.length; i++) {
			String string = ministersName[i];
			System.out.println("karntaka ministers names:"+ string);	
		}

		for (int i = 0; i < famousplaces.length; i++) {
			String string = famousplaces[i];
			System.out.println("karntaka famousplaces names:"+ string);	
		}


		for (int i = 0; i < districts.length; i++) {
			String string = districts[i];
			System.out.println("karntaka districts names:"+ string);	
		}


		for (int i = 0; i < indianTeamCricketers.length; i++) {
			String string = indianTeamCricketers[i];
			System.out.println("karntaka indian cricketers names:"+ string);	
		}


		for (int i = 0; i < famousDistricts.length; i++) {
			String string = famousDistricts[i];
			System.out.println("karntaka famousDistricts names:"+ string);	
		}

		for (int i = 0; i < famousActres.length; i++) {
			String string = famousActres[i];
			System.out.println("karntaka famousActres names:"+ string);	
		}


		
	}
	


}
