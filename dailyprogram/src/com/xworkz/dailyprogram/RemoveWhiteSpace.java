package com.xworkz.dailyprogram;

public class RemoveWhiteSpace {

public static void main(String[] args) {
		
		String str="Remove White Space";
		String str1="";
		System.out.println(str);
		
		int l=str.length();
		for (int i = 0; i < l; i++) {
			if (str.charAt(i)!=' ') {
				str1=str1+str.charAt(i);
			}else
				continue;
		}
		System.out.println(str1);
	}

}
