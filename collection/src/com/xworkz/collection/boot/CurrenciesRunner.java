package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.TreeSet;

public class CurrenciesRunner {

	public static void main(String[] args) {

		String currency1 = "Indian rupee";
		String currency2 = "peso";
		String currency3 = "croatian kuna";
		String currency4 = "chilean peso";
		String currency5 = "brunei dollar";
		String currency6 = "sol";
		String currency7 = "omani rial";
		String currency8 = "thai bhat";
		String currency9 = "indonesia rupaih";
		String currency10 = "turkish lira";
		String currency11 = "swedish krona";
		String currency12 = "phillipine peso";
		String currency13 = "bulgarain lev";
		String currency14 = "danish krone";
		String currency15 = "brazillian real";
		String currency16 = "south african rand";
		String currency17 = "hong kong dollar";
		String currency18 = "russian rubel";
		String currency19 = "japanese yen";
		String currency20 = "singapur dollar";
		String currency21 = "swiss franc";
		String currency22 = "canadian dollar";
		String currency23 = "australian dollar";
		String currency24 = "pound sterling";
		String currency25 = "euro";
		String currency26 = "U S dollar";

		Collection<String> collection = new TreeSet<String>();
		collection.add(currency1);
		collection.add(currency2);
		collection.add(currency3);
		collection.add(currency4);
		collection.add(currency5);
		collection.add(currency6);
		collection.add(currency7);
		collection.add(currency8);
		collection.add(currency9);
		collection.add(currency10);
		collection.add(currency11);
		collection.add(currency12);
		collection.add(currency13);
		collection.add(currency14);
		collection.add(currency15);
		collection.add(currency16);
		collection.add(currency17);
		collection.add(currency18);
		collection.add(currency19);
		collection.add(currency20);
		collection.add(currency21);
		collection.add(currency22);
		collection.add(currency23);
		collection.add(currency24);
		collection.add(currency25);
		collection.add(currency26);

		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}

}
