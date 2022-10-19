package com.xworkz.other;

import com.xworkz.boot.Fruits;

public class FruitsRunner {

	public static void main(String[] args) {
		
		String[] sizes= {"2kg","10kg","40kg","50kg"};
		String[] sources= {"potassium","vitamin c","fiber","folate"};
		String[] values={"straight","circle",};
		String[] shapes= {"round","rectangle","straight"};
		String[] colors= {"red","green","yellow","white"};
	    double[] money= {150.25,125.21,1450.25};
	    
	    Fruits fruits=new Fruits(true,"sweet","71%",10,15,sizes,sources,values,shapes,colors,money);
		fruits.display();
		
}

}