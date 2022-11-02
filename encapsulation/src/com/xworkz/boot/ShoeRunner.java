package com.xworkz.boot;

import com.xworkz.things.Shoe;
import com.xworkz.things.ShoeModify;

public class ShoeRunner {

	public static void main(String[] args) {
		Shoe shoe = new Shoe();
		System.out.println(shoe.getName());
		ShoeModify modify = new ShoeModify();
		modify.useShoe(shoe);

	}

}
