package com.xworkz.boot;

import com.xworkz.things.Bag;
import com.xworkz.things.BagModify;

public class BagRunner {

	public static void main(String[] args) {

		Bag bag = new Bag();
		System.out.println(bag.getBrand());
		System.out.println(bag.getType());
		BagModify modify = new BagModify();
		modify.useBag(bag);

	}

}
