package com.xworkz.dailyprogram;

import java.util.Scanner;

public class Eureka {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int end = sc.nextInt();
		// System.out.println(start);
		// System.out.println(end);
		for (int i = start; i <= end; i++) {
			System.out.println(i);
			int temp = i;
			int num = temp;
			System.out.println(" " + temp);
			int count = 0;
			for (; temp != 0; temp = temp / 10) {
				count++;
			}
			int n = temp;
			int ref = 0;
			int sum = 0;
			for (; n > 0; n = n / 10)
				ref = n % 10;
			sum = (int) Math.pow(ref, count);
			count--;
		}
		if (num == sum) {

			System.out.println(nums + " ");
		}
	}

}
