package com.xworkz.boot;

import com.xworkz.things.Shirt;
import com.xworkz.things.ShirtModify;

public class ShirtRunner {

	public static void main(String[] args) {
		Shirt shirt = new Shirt();
		System.out.println(shirt.getName());
		System.out.println(shirt.getType());
		ShirtModify modify = new ShirtModify();
		modify.useShirt(shirt);

	}

}
