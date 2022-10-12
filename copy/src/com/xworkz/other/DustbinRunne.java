package com.xworkz.other;

import com.xworkz.boot.Dustbin;

public class DustbinRunne {

	public static void main(String[] args) 
	{

		Dustbin dustBin=new Dustbin();
		
		dustBin.size="small";
		dustBin.shape="round";
		dustBin.use="store waste";
		dustBin.material="plastic or cement";
		dustBin.usedInHouse=true;
		dustBin.capacity="100L";
		dustBin.style="british";
		dustBin.function="all substance storage";
		dustBin.usedInParks=true;
		
		
    	System.out.println(dustBin.size);
		System.out.println(dustBin.shape);
		System.out.println(dustBin.use);
		System.out.println(dustBin.material);
		System.out.println(dustBin.capacity);
		System.out.println(dustBin.style);
		System.out.println(dustBin.usedInHouse);
		System.out.println(dustBin.function);
		System.out.println(dustBin.usedInParks);
	

	
		System.out.println(dustBin.everyIndianDontUSeDB);
		System.out.println(dustBin.weNeedDustBins);
		System.out.println(dustBin.itStoresRawWaste);
		System.out.println(dustBin.itStoresRawWaste);
		System.out.println(dustBin.usedInHospitals);
		System.out.println(dustBin.availableInOnline);
		System.out.println(dustBin.itStoresJuice);
		System.out.println(dustBin.homeNeedDustBin);
		System.out.println(dustBin.fact);


	}

}
