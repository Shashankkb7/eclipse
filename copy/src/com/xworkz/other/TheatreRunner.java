package com.xworkz.other;

import com.xworkz.boot.Theatre;
import com.xworkz.constants.Languages;
import com.xworkz.constants.SeatType;

public class TheatreRunner {

	public static void main(String[] args) {
		
		double[] price= {100.50,400.25,450.25,500.75};
		int[] noOfScreens= {1,2,3,4,5};
		String[] filmNames= {"KGF","Kantara","Airavatha","Vikrant Rona"};
		String[] effects= {"Dolby","2D","3D"};
		
		Theatre theatre=new Theatre("Navrang","Navrang Circle","Rajkumar",true,250,price,noOfScreens,filmNames,effects,SeatType.FIRST_CLASS,Languages.KANNADA);
		theatre.show();
	}

}
