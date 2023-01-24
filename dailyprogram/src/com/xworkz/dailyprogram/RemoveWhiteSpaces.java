package com.xworkz.dailyprogram;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		int count = 0;
		String str = "Remove white spaces";
		String str1 = "", reverse = "";
		for (char ch : str.toCharArray()) {
			if (ch == ' ') {
				count += 1;// count=count+1;
			} else {
				str1 += ch;// s=s+ch;
			}
			if (count > 0 && count <= 1) {
				reverse = ch + reverse;
			}
		}
		System.out.println(count);
		System.out.println(str1);
		System.out.println(reverse);

	}
}
