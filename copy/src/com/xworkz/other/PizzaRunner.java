package com.xworkz.other;

import com.xworkz.boot.Pizza;

public class PizzaRunner {

	public static void main(String[] args) {
		

		int[] quantity= {100,1000,1500,500,600,};
		double[] amount= {180.25,200.25,400.50,500.15,800.25};
		String[] sizes= {"Small","Medium","Large"};
		String[] types= {"Veg pizza","Golden corn","Golden corn veg pizza","Margareeta"};
		String[] ingredients= {"Corn","Salt","Cheese","Tomato"};
		String[] color= {"Cream","Brown"};
		
		Pizza pizza=new Pizza("Pizza",45201,true,true,true,quantity,amount,sizes,types,ingredients,color);
		pizza.display();
	}

}
