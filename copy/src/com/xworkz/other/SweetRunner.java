 package com.xworkz.other;

import com.xworkz.boot.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sweet sweet=new Sweet("Kantara Sweets");
		sweet.setPrice(200.50);
		sweet.quantity=50;
		sweet.display();
		sweet.totalPrice();
		
		
	}

}
