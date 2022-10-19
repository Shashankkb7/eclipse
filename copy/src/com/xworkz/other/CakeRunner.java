package com.xworkz.other;

import com.xworkz.boot.Cake;

public class CakeRunner {

	public static void main(String[] args) {
		
		int[] quantity= {100,1000,1500,500,600,};
		int[] amount= {10,20,40,50,80};
		String[] shape= {"Square","Cone","Rectangle","Circle"};
		String[] flavour= {"Pineapple","Strawberry","Chocolate"};
		String[] ingredients= {"Sugar","Bread","Cream"};
		String[] color= {"White","Red","Yellow","Black"};
		
		Cake cake=new Cake("Honey cake",450122,true,true,true,quantity,amount,shape,flavour,ingredients,color);
		cake.display();
	}

}
