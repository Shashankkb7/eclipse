package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.TreeSet;

public class CouponRunner {

	public static void main(String[] args) {

		String coupon1 = "abcd";
		String coupon2 = "efgh";
		String coupon3 = "ijkl";
		String coupon4 = "mnop";
		String coupon5 = "qrst";
		String coupon6 = "uvwx";
		String coupon7 = "yzqw";
		String coupon8 = "erty";
		String coupon9 = "uiop";
		String coupon10 = "asdf";
		String coupon11 = "ghjk";
		String coupon12 = "lzxc";

		Collection<String> collection = new TreeSet<String>();
		collection.add(coupon1);
		collection.add(coupon2);
		collection.add(coupon3);
		collection.add(coupon4);
		collection.add(coupon5);
		collection.add(coupon6);
		collection.add(coupon7);
		collection.add(coupon8);
		collection.add(coupon9);
		collection.add(coupon10);
		collection.add(coupon11);
		collection.add(coupon12);

		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());
	}

}
