package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DamsRunner {

	public static void main(String[] args) {

		Collection<String> damsInKarnataka = new ArrayList<String>();
		damsInKarnataka.add("Alamatti Dam");
		damsInKarnataka.add("KRS Dam");
		damsInKarnataka.add("TB Dam");
		damsInKarnataka.add("Bhadra Dam");
		damsInKarnataka.add("Harangi Dam");
		damsInKarnataka.add("Supa Dam");
		damsInKarnataka.add("Narayanpur Dam");
		damsInKarnataka.add("Kodasalli Dam");
		damsInKarnataka.add("Linganamakki Dam");
		damsInKarnataka.add("Hidkal Dam");
		damsInKarnataka.add("Kadra Dam");
		damsInKarnataka.add("Hemavathi Dam");
		damsInKarnataka.add("Renuka sagara");
		damsInKarnataka.add("Chandrampalli Dam");
		damsInKarnataka.add("Kanva Reservoir");
		damsInKarnataka.add("Bheemasamudra");
		damsInKarnataka.add("Karanja Dam");
		System.out.println("Karnataka state dam size " + damsInKarnataka.size());

		Collection<String> damsInKerala = new ArrayList<String>();
		damsInKerala.add("Mullaperiyar Dam");
		damsInKerala.add("Parambikulam Dam");
		damsInKerala.add("Idukki Dam");
		damsInKerala.add("Pothundi Dam");
		damsInKerala.add("Banasura sagar Dam");
		damsInKerala.add("Idamalayar Dam");
		damsInKerala.add("Malampuzha Dam");
		damsInKerala.add("Neyyar Dam");
		damsInKerala.add("Kakkayam Dam");
		damsInKerala.add("Malanakara Dam");
		damsInKerala.add("Mangalam Dam");
		damsInKerala.add("Cheruthoni Dam");
		damsInKerala.add("Kakki Dam");
		damsInKerala.add("Mattupetty Dam");
		damsInKerala.add("Sholayar Dam");
		damsInKerala.add("Siruvani Dam");
		damsInKerala.add("Karapuzha Dam");
		damsInKerala.add("Pamba Dam");
		damsInKerala.add("Walayar Dam");
		damsInKerala.add("Ponmudi Dam");
		damsInKerala.add("Thenmala Dam");
		damsInKerala.add("Kundala Dam");
		damsInKerala.add("Kallar Dam");
		System.out.println("Kerala state dam size " + damsInKerala.size());

		Collection<String> damsInAndhraPradesh = new ArrayList<String>();
		damsInAndhraPradesh.add("Nagarajuna Sagar Dam");
		damsInAndhraPradesh.add("Srisailam Dam");
		damsInAndhraPradesh.add("Polavaram");
		damsInAndhraPradesh.add("Somasila Dam");
		damsInAndhraPradesh.add("Pulichinthala");
		damsInAndhraPradesh.add("Nallamalasagar");
		damsInAndhraPradesh.add("Jalaput Dam");
		damsInAndhraPradesh.add("Gandikota");
		damsInAndhraPradesh.add("Kalyani Dam");
		damsInAndhraPradesh.add("Brahmasagar");
		damsInAndhraPradesh.add("Velugodu");
		damsInAndhraPradesh.add("PABR Dam");
		damsInAndhraPradesh.add("VYKUNTAPURAM");
		damsInAndhraPradesh.add("Chitravathi");
		damsInAndhraPradesh.add("Mylavaram Dam");
		damsInAndhraPradesh.add("Dowleswaram");
		damsInAndhraPradesh.add("Mid pennar Dam");
		damsInAndhraPradesh.add("Veligallu Dam");
		damsInAndhraPradesh.add("Rajolibanda Dam");
		damsInAndhraPradesh.add("Gundlakamma");
		damsInAndhraPradesh.add("Tatipudi");
		damsInAndhraPradesh.add("Prakasham");
		damsInAndhraPradesh.add("Thotapalli");
		damsInAndhraPradesh.add("Sanjeevaiah sagar Dam");
		damsInAndhraPradesh.add("Sunkesula");
		damsInAndhraPradesh.add("Jeedipalli");
		damsInAndhraPradesh.add("Gollapalli");
		System.out.println("AndhraPradesh state dam size " + damsInAndhraPradesh.size());

		Collection<String> damsInMaharashtra = new ArrayList<String>();
		damsInMaharashtra.add("Koyna Dam");
		damsInMaharashtra.add("Mulshi Dam");
		damsInMaharashtra.add("Khadakwasla Dam");
		damsInMaharashtra.add("Jayakwadi Dam");
		damsInMaharashtra.add("Panshet Dam");
		damsInMaharashtra.add("Vaitarna Dam");
		damsInMaharashtra.add("Bhatsa Dam");
		damsInMaharashtra.add("Ujjani Dam");
		damsInMaharashtra.add("Gangapur Dam");
		damsInMaharashtra.add("Radhanagari Dam");
		damsInMaharashtra.add("Bhushi Dam");
		System.out.println("Maharashtra state dam size " + damsInMaharashtra.size());

		Collection<String> damsInArunachalPradesh = new ArrayList<String>();
		damsInArunachalPradesh.add("Ranganadi Dam");
		damsInArunachalPradesh.add("Subansiri Dam");
		System.out.println("ArunachalPradesh state dam size " + damsInArunachalPradesh.size());

		Collection<String> damsInMeghalaya = new ArrayList<String>();
		damsInMeghalaya.add("Khandong dam");
		damsInMeghalaya.add("Kyrdemkulai Dam");
		damsInMeghalaya.add("Mawphlang dam");
		damsInMeghalaya.add("Myntduleksha Dam");
		damsInMeghalaya.add("Nongkhyllem Dam");
		damsInMeghalaya.add("Umaiam Dam");
		damsInMeghalaya.add("Umtru Dam");
		System.out.println("Meghalaya state dam size " + damsInMeghalaya.size());

		Collection<String> damsInWestBengal = new ArrayList<String>();
		damsInWestBengal.add("Nagarjuna Sagar Dam");
		damsInWestBengal.add("Indira sagar Dam");
		damsInWestBengal.add("Tehri Dam");
		damsInWestBengal.add("Idukki Dam");
		damsInWestBengal.add("Srisailam Dam");
		damsInWestBengal.add("Bhavanisagar Dam");
		damsInWestBengal.add("Farakka Dam");
		System.out.println("WestBengal state dam size " + damsInWestBengal.size());

		Collection<String> damsInUttarPradesh = new ArrayList<String>();
		damsInUttarPradesh.add("Upper ganges");
		damsInUttarPradesh.add("Central ganges");
		damsInUttarPradesh.add("Lower ganges");
		damsInUttarPradesh.add("Ramganga");
		damsInUttarPradesh.add("East yamuna");
		damsInUttarPradesh.add("Agra");
		damsInUttarPradesh.add("Sharda");
		damsInUttarPradesh.add("Saryu");
		damsInUttarPradesh.add("Ghaghra");
		damsInUttarPradesh.add("Betwa");
		damsInUttarPradesh.add("Ken");
		damsInUttarPradesh.add("Gandak");
		damsInUttarPradesh.add("Rani laksmi bai dam");
		damsInUttarPradesh.add("Rajghat");
		damsInUttarPradesh.add("Rihand");
		damsInUttarPradesh.add("Bansagar");
		damsInUttarPradesh.add("Belan tons");
		damsInUttarPradesh.add("Banganga barrage");
		damsInUttarPradesh.add("Naugarh");
		damsInUttarPradesh.add("Meja");
		damsInUttarPradesh.add("chandraprabha");
		damsInUttarPradesh.add("Arjuna");
		damsInUttarPradesh.add("Ahrira");
		damsInUttarPradesh.add("Nagva");
		damsInUttarPradesh.add("Dhasan");
		damsInUttarPradesh.add("Saprar");
		System.out.println("UttarPradesh state dam size " + damsInUttarPradesh.size());

		Collection<String> damsInGujarat = new ArrayList<String>();
		damsInGujarat.add("Dharoi");
		damsInGujarat.add("Dantiwada");
		damsInGujarat.add("Ukai");
		damsInGujarat.add("Sardar sarovar");
		damsInGujarat.add("Kadana");
		damsInGujarat.add("Kamleshwar");
		damsInGujarat.add("Dholidhaja");
		damsInGujarat.add("Karai");
		System.out.println("Gujarat state dam size " + damsInGujarat.size());

		Collection<String> damsInHimachalPradesh = new ArrayList<String>();
		damsInHimachalPradesh.add("Bhakra");
		damsInHimachalPradesh.add("Chamera");
		damsInHimachalPradesh.add("Pndoh");
		damsInHimachalPradesh.add("Nagarjuna sagar");
		damsInHimachalPradesh.add("Nathpa");
		damsInHimachalPradesh.add("Tungabhadra");
		damsInHimachalPradesh.add("Idukki");
		damsInHimachalPradesh.add("Pong");
		damsInHimachalPradesh.add("Koldam");
		damsInHimachalPradesh.add("Maharana pratap");
		damsInHimachalPradesh.add("Indira sagar");
		damsInHimachalPradesh.add("Linganamakki");
		damsInHimachalPradesh.add("Radhanagari");
		damsInHimachalPradesh.add("Panshet");
		damsInHimachalPradesh.add("Malapuzha");
		damsInHimachalPradesh.add("Wilson");
		damsInHimachalPradesh.add("Ujani");
		damsInHimachalPradesh.add("Pawna");
		damsInHimachalPradesh.add("Vaigai");
		damsInHimachalPradesh.add("Cheruthoni");
		damsInHimachalPradesh.add("Yamuna");
		System.out.println("HimachalPradesh state dam size " + damsInHimachalPradesh.size());

		Collection<String> damsInRajasthan = new ArrayList<String>();
		damsInRajasthan.add("Bislapur");
		damsInRajasthan.add("Jawahar sagar");
		damsInRajasthan.add("Rana pratap sagar");
		damsInRajasthan.add("Jakham");
		damsInRajasthan.add("Jawai");
		damsInRajasthan.add("Mahi bajaj sagar");
		damsInRajasthan.add("Tehri");
		damsInRajasthan.add("Cheruthoni");
		damsInRajasthan.add("Idukki");
		damsInRajasthan.add("Meja");
		System.out.println("Rajasthan state dam size " + damsInRajasthan.size());

		Collection<String> damsInSikkim = new ArrayList<String>();
		damsInSikkim.add("Rangit-III");
		damsInSikkim.add("Rangpo");
		damsInSikkim.add("Rongli");
		damsInSikkim.add("Teesta-V");
		damsInSikkim.add("Teesta-III");
		damsInSikkim.add("Teesta-IV");
		System.out.println("Sikkim state dam size " + damsInSikkim.size());

		Collection<String> damsInBihar = new ArrayList<String>();
		damsInBihar.add("Upper kiul");
		damsInBihar.add("Srikhandi");
		damsInBihar.add("Sindhwarni");
		damsInBihar.add("Phulwaria");
		damsInBihar.add("Orhni");
		damsInBihar.add("Nakt");
		damsInBihar.add("Nagi");
		damsInBihar.add("Morwy");
		damsInBihar.add("Kolmahad");
		damsInBihar.add("Kohira");
		damsInBihar.add("Khargpur");
		damsInBihar.add("Kailash ghati");
		damsInBihar.add("Job");
		damsInBihar.add("Jaikund");
		damsInBihar.add("Gaighat");
		damsInBihar.add("Durgawati");
		damsInBihar.add("Bilasi");
		damsInBihar.add("Belharna");
		damsInBihar.add("Baskund");
		damsInBihar.add("Barnar");
		damsInBihar.add("Badua");
		damsInBihar.add("Amrity");
		damsInBihar.add("Ajan");
		System.out.println("Bihar state dam size " + damsInBihar.size());

		Collection<String> damsInAssam = new ArrayList<String>();
		damsInAssam.add("Karbi lanpi");
		damsInAssam.add("Umrong");
		damsInAssam.add("Pagladiya");
		damsInAssam.add("Subansiri");
		damsInAssam.add("Borpani");
		System.out.println("Assam state dam size " + damsInAssam.size());

		Collection<String> damsInMizoram = new ArrayList<String>();
		damsInMizoram.add("Tehri");
		damsInMizoram.add("Doyang");
		damsInMizoram.add("Tuirial");
		damsInMizoram.add("Bhakra");
		damsInMizoram.add("Ranganadi");
		damsInMizoram.add("Hatnur");
		System.out.println("Mizoram state dam size " + damsInMizoram.size());

		Collection<String> damsInMadhyaPradesh = new ArrayList<String>();
		damsInMadhyaPradesh.add("Gandhi sagar");
		damsInMadhyaPradesh.add("Bansagar");
		damsInMadhyaPradesh.add("Indirasagar");
		damsInMadhyaPradesh.add("Bhakra nangal");
		damsInMadhyaPradesh.add("Bargi");
		damsInMadhyaPradesh.add("Barna");
		damsInMadhyaPradesh.add("Tawa");
		damsInMadhyaPradesh.add("Tehri");
		damsInMadhyaPradesh.add("Nagarjuna sagar");
		damsInMadhyaPradesh.add("Rajghat");
		damsInMadhyaPradesh.add("Idukki");
		damsInMadhyaPradesh.add("Nathpa jhakri");
		damsInMadhyaPradesh.add("Omkareshwar");
		damsInMadhyaPradesh.add("Khadakwasla");
		damsInMadhyaPradesh.add("Malampuzha");
		damsInMadhyaPradesh.add("Mulshi");
		damsInMadhyaPradesh.add("Kadra");
		damsInMadhyaPradesh.add("Almatti");
		damsInMadhyaPradesh.add("Ujani");
		damsInMadhyaPradesh.add("Kundala");
		damsInMadhyaPradesh.add("Cheruthoni");
		damsInMadhyaPradesh.add("Madikheda");
		damsInMadhyaPradesh.add("Gangapur");
		damsInMadhyaPradesh.add("Tansa");
		System.out.println("MadhyaPradesh state dam size " + damsInMadhyaPradesh.size());

		Collection<String> damsInOdisha = new ArrayList<String>();
		damsInOdisha.add("Hirakud");
		damsInOdisha.add("Indravati");
		damsInOdisha.add("Jalaput");
		damsInOdisha.add("Kala");
		damsInOdisha.add("Kolab");
		damsInOdisha.add("Lower Indra");
		damsInOdisha.add("Mandira");
		damsInOdisha.add("Patora");
		damsInOdisha.add("Rengali");
		damsInOdisha.add("Sapura");
		damsInOdisha.add("Sunei");
		System.out.println("Odisha state dam size " + damsInOdisha.size());

		Collection<String> damsInTripura = new ArrayList<String>();
		damsInTripura.add("Gumti hydro");
		System.out.println("Tripura state dam size " + damsInTripura.size());

		Collection<String> damsInJharkhand = new ArrayList<String>();
		damsInJharkhand.add("Getalsud");
		damsInJharkhand.add("Chandil");
		damsInJharkhand.add("Konar");
		damsInJharkhand.add("Maithon");
		damsInJharkhand.add("Panchet");
		damsInJharkhand.add("Tenughat");
		damsInJharkhand.add("Tilaiya");
		damsInJharkhand.add("Khandoli");
		damsInJharkhand.add("Massanjore");
		damsInJharkhand.add("Punasi");
		System.out.println("Jharkhand state dam size " + damsInJharkhand.size());

		Collection<String> damsInNagaland = new ArrayList<String>();
		damsInNagaland.add("Doyang hep");
		System.out.println("Nagaland state dam size " + damsInNagaland.size());

		Collection<String> damsInManipur = new ArrayList<String>();
		damsInManipur.add("Khuga");
		damsInManipur.add("Tipaimukh");
		System.out.println("Manipur state dam size " + damsInManipur.size());

		Collection<String> damsInHaryana = new ArrayList<String>();
		damsInHaryana.add("Hathni kund");
		damsInHaryana.add("Palla");
		damsInHaryana.add("Masani");
		damsInHaryana.add("Tajewala");
		damsInHaryana.add("Anangpur");
		damsInHaryana.add("Kaushalya");
		damsInHaryana.add("Ottu");
		damsInHaryana.add("Pathrala");
		System.out.println("Haryana state dam size " + damsInHaryana.size());

		Collection<String> damsInGoa = new ArrayList<String>();
		damsInGoa.add("Amthane");
		damsInGoa.add("Anjunem");
		damsInGoa.add("Moisal");
		damsInGoa.add("Chapoli");
		damsInGoa.add("Salaulim");
		System.out.println("Goa state dam size " + damsInGoa.size());

		Collection<String> damsInTamilNadu = new ArrayList<String>();
		damsInTamilNadu.add("Aathupalayam");
		damsInTamilNadu.add("Aliyar");
		damsInTamilNadu.add("Amaravathi");
		damsInTamilNadu.add("Bhavanisagar");
		damsInTamilNadu.add("Gomukhinadhi");
		damsInTamilNadu.add("Kodiveri");
		damsInTamilNadu.add("Mettur");
		damsInTamilNadu.add("Lower anicut");
		damsInTamilNadu.add("Kallanai");
		damsInTamilNadu.add("Nallathangal");
		damsInTamilNadu.add("Orathuppalayam");
		damsInTamilNadu.add("Pechiparai");
		damsInTamilNadu.add("Perunchani");
		damsInTamilNadu.add("Puzhal");
		damsInTamilNadu.add("Sathanur");
		damsInTamilNadu.add("Solaiyar");
		damsInTamilNadu.add("Vaigai");
		damsInTamilNadu.add("Manimuthar and karaiyar");
		System.out.println("TamilNadu state dam size " + damsInTamilNadu.size());

		Collection<String> damsInChhattisgarh = new ArrayList<String>();
		damsInChhattisgarh.add("Dudhawa");
		damsInChhattisgarh.add("Gangrel");
		damsInChhattisgarh.add("Minimata hasdeo bango");
		damsInChhattisgarh.add("Kherkatta");
		damsInChhattisgarh.add("Mongra");
		damsInChhattisgarh.add("Murrum");
		damsInChhattisgarh.add("Sondur");
		damsInChhattisgarh.add("Tandula");
		System.out.println("Chhattisgarh state dam size " + damsInChhattisgarh.size());

		Collection<String> damsInJammuAndKashmir = new ArrayList<String>();
		damsInJammuAndKashmir.add("Salai");
		damsInJammuAndKashmir.add("Chutak");
		damsInJammuAndKashmir.add("Dul hasti");
		damsInJammuAndKashmir.add("Kishanganga");
		damsInJammuAndKashmir.add("Nimoo bazgo");
		damsInJammuAndKashmir.add("Ratle");
		damsInJammuAndKashmir.add("Uri-II");
		damsInJammuAndKashmir.add("Baglihar");
		System.out.println("JammuAndKashmir state dam size " + damsInJammuAndKashmir.size());

		Collection<String> damsInPunjab = new ArrayList<String>();
		damsInPunjab.add("Ranjit sagar");
		System.out.println("Punjab state dam size " + damsInPunjab.size());

		Collection<String> damsInTelangana = new ArrayList<String>();
		damsInTelangana.add("Singur");
		damsInTelangana.add("Lower Manair");
		damsInTelangana.add("Mid Manair");
		damsInTelangana.add("Upper Manair");
		damsInTelangana.add("Sathnala");
		damsInTelangana.add("Pocharam");
		damsInTelangana.add("Lendi");
		damsInTelangana.add("Nagarjuna sagar");
		damsInTelangana.add("Srisailam");
		damsInTelangana.add("Rajolibanda");
		System.out.println("Telangana state dam size " + damsInTelangana.size());

		Collection<String> damsInUttarakhand = new ArrayList<String>();
		damsInUttarakhand.add("Ichari");
		damsInUttarakhand.add("Maneri");
		damsInUttarakhand.add("Koteshwar");
		damsInUttarakhand.add("Tapovan vishnugad");
		damsInUttarakhand.add("Tehri");
		damsInUttarakhand.add("Ramaganga");
		damsInUttarakhand.add("Vishnuprayag");
		System.out.println("Uttarakhand state dam size " + damsInUttarakhand.size());

		Collection<String> damsInIndia = new ArrayList<String>();
		damsInIndia.addAll(damsInAndhraPradesh);
		damsInIndia.addAll(damsInArunachalPradesh);
		damsInIndia.addAll(damsInAssam);
		damsInIndia.addAll(damsInBihar);
		damsInIndia.addAll(damsInChhattisgarh);
		damsInIndia.addAll(damsInGoa);
		damsInIndia.addAll(damsInGujarat);
		damsInIndia.addAll(damsInHaryana);
		damsInIndia.addAll(damsInHimachalPradesh);
		damsInIndia.addAll(damsInJammuAndKashmir);
		damsInIndia.addAll(damsInJharkhand);
		damsInIndia.addAll(damsInKarnataka);
		damsInIndia.addAll(damsInKerala);
		damsInIndia.addAll(damsInMadhyaPradesh);
		damsInIndia.addAll(damsInMaharashtra);
		damsInIndia.addAll(damsInManipur);
		damsInIndia.addAll(damsInMeghalaya);
		damsInIndia.addAll(damsInMizoram);
		damsInIndia.addAll(damsInNagaland);
		damsInIndia.addAll(damsInOdisha);
		damsInIndia.addAll(damsInPunjab);
		damsInIndia.addAll(damsInRajasthan);
		damsInIndia.addAll(damsInSikkim);
		damsInIndia.addAll(damsInTamilNadu);
		damsInIndia.addAll(damsInTelangana);
		damsInIndia.addAll(damsInTripura);
		damsInIndia.addAll(damsInUttarakhand);
		damsInIndia.addAll(damsInUttarPradesh);
		damsInIndia.addAll(damsInWestBengal);
		System.out.println("=======================================");

		Iterator<String> starts = damsInIndia.iterator();
		while (starts.hasNext()) {
			String element = starts.next();
			if (element.startsWith("T")) {
				System.out.println("Element start with T " + element);
			}
		}
		System.out.println("=======================================");

		Iterator<String> ends = damsInIndia.iterator();
		while (ends.hasNext()) {
			String element = ends.next();
			if (element.endsWith("ra")) {
				System.out.println("Element ends with ra " + element);
			}
		}
		System.out.println("=======================================");

		Iterator<String> checkLength = damsInIndia.iterator();
		while (checkLength.hasNext()) {
			String element = checkLength.next();
			if (element != null && element.length() >= 15) {
				System.out.println("Element length greater than 15 characters " + element);
			}
		}
		System.out.println("=======================================");

		Iterator<String> checkUpperCase = damsInIndia.iterator();
		while (checkUpperCase.hasNext()) {
			String element = checkUpperCase.next();
			System.out.println("Element with upper case " + element.toUpperCase());
		}
		System.out.println("=======================================");

		Iterator<String> checkLowerCase = damsInIndia.iterator();
		while (checkLowerCase.hasNext()) {
			String element = checkLowerCase.next();
			System.out.println("Element with lower case " + element.toLowerCase());
		}
		System.out.println("=======================================");

		/*
		 * Iterator<String> remove = damsInIndia.iterator(); while (remove.hasNext()) {
		 * String element = remove.next(); if (element.contains("P"))
		 * System.out.println("Removing all dams it contains P " + element);
		 * remove.remove(); }
		 */

		Iterator<String> palindrome = damsInIndia.iterator();
		while (palindrome.hasNext()) {
			String element = palindrome.next();
			String reverse = "";
			for (int i = element.length() - 1; i >= 0; i--) {
				reverse = reverse + element.charAt(i);
			}
			if (reverse.equalsIgnoreCase(element)) {
				System.out.println("Element is Palindrome " + reverse);
			} else {
				// System.err.println("Element is not a Palindrome " + stringRev);
			}
		}
	}
}
