package com.xworkz.dailyprogram;

public class ReverseString {

	public static void main(String[] args) {

		String reversing = "";
		String name = "shashank";
		for (int i = name.length() - 1; i >= 0; i--) {
			reversing = reversing + name.charAt(i);
		}

		System.out.println(name);
		System.out.println(reversing);

		System.out.println(name.length());

		StringBuilder reverse = new StringBuilder();
		reverse.append(name);
		reverse.reverse();
		System.out.println(reverse);
	}

}
