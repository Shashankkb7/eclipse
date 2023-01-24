package com.xworkz.dailyprogram;

import java.util.Scanner;

public class CouponCode {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String coupon = scan.next();

		String str1 = coupon.substring(0, 2);
		System.out.println(str1);
		String str2 = coupon.substring(0, 4);
		System.out.println(str2);
		String str3 = coupon.substring(2, 6);
		System.out.println(str3);
		// CH2022265D

		int convertString = Integer.parseInt(str3);
		//int convertString = Integer.valueOf(str3);
		System.out.println("Convert String to int :" + convertString);
	}

}
