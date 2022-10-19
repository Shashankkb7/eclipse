package com.xworkz.other;

import com.xworkz.boot.Karnataka;

public class KarnatakaRunner {

	public static void main(String[] args) {
	
		String[] ministers= {"siddaramayya","yadayurappa","kumarswamy","devegowda"};
		String[] famousplaces= {"mullayangiri","mysore palace","mangalore beaches","lalbagh and kubban park"};
		String[] districts= {"chitradurga","mangalore","chikkamagalur","shivamogga","bangalore","......."};
		String[] indianTeamCricketers= {"Anil kumble","K L rahul","Rahul Dravid","Manish Pandey","Mayank Agarwal"};
		String[] famousDistricts= {"chikkamagalur","hassan","mangalore","bangalore"};
		String[] famousActres= {"Dr.Rajkumar","Vishnuvardhan","Shankarnag","Anantnag"};
		
		Karnataka karnataka=new Karnataka("Karnataka","Basavaraj Bommayi","Bangalore",31,70000000,ministers,famousplaces,districts,indianTeamCricketers,famousDistricts,famousActres);
		karnataka.open();
	}

}
