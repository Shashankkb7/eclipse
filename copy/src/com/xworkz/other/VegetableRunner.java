package com.xworkz.other;

import com.xworkz.boot.Vegetable;

public class VegetableRunner {

	public static void main(String[] args) {
			
			String[] sizes= {"2kg","10kg","40kg","50kg"};
			String[] sources= {"potassium","vitamin c","fiber","folate"};
			String[] values={"straight","circle",};
			String[] shapes= {"round","rectangle","straight"};
			String[] colors= {"red","green","yellow","white"};
		    double[] money= {150.25,125.21,1450.25};
		    
		    Vegetable vegetable=new Vegetable(true,"bitter","71%",10,15,sizes,sources,values,shapes,colors,money);
			vegetable.display();
			
	}

}
