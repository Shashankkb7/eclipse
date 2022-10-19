package com.xworkz.other;

import com.xworkz.boot.MobileCharger;

public class MobileChargerRunner {


		public static void main(String[] args) {
			
			String[] types={"nokia","vivo"};
			String[] color= {"black","white","red"};
			String[] shopName= {"natraj","sanjay","arun"};
			String[] coustomersName= {"arun","natraj","natraj"};
			String[] ingrediants= {"plastic","wire","converter"};
		 	
			
			MobileCharger mobileCharger=new MobileCharger("vivo",700,1.0,1f,"square",types,color,shopName,coustomersName,ingrediants);
			
		
		     mobileCharger.display();
		}
}
